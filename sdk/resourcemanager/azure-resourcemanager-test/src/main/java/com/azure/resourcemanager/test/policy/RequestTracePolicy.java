// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.test.policy;

import com.azure.core.http.ContentType;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class RequestTracePolicy implements HttpPipelinePolicy {

    private final ClientLogger logger = new ClientLogger(RequestTracePolicy.class);

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        HttpRequest request = context.getHttpRequest();

        StringBuilder traceBuilder = new StringBuilder();
        traceBuilder.append("method: ").append(request.getHttpMethod()).append(System.lineSeparator());
        traceBuilder.append("url: ").append(request.getUrl()).append(System.lineSeparator());
        traceBuilder.append("headers: ").append(request.getHeaders()).append(System.lineSeparator());

        String contentType = request.getHeaders().getValue("Content-Type");
//        long contentLength = getContentLength(request.getHeaders());

        if (request.getBody() != null && shouldBodyBeLogged(contentType)) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            WritableByteChannel bodyContentChannel = Channels.newChannel(outputStream);

            // Add non-mutating operators to the data stream.
            Flux<ByteBuffer> body = request.getBody()
                .flatMap(byteBuffer -> writeBufferToBodyStream(bodyContentChannel, byteBuffer))
                .doFinally(ignored -> {
                    traceBuilder.append("body: ")
                        .append(convertStreamToString(outputStream))
                        .append(System.lineSeparator());

                    System.out.println(traceBuilder.toString());
                });
            request.setBody(body);

            // drain the request body, only do this in PLAYBACK, delete this in LIVE/RECORD
            body.subscribe();
        } else {
            System.out.println(traceBuilder.toString());
        }

        return next.process();
    }

    private long getContentLength(HttpHeaders headers) {
        long contentLength = 0;

        String contentLengthString = headers.getValue("Content-Length");
        if (CoreUtils.isNullOrEmpty(contentLengthString)) {
            return contentLength;
        }

        try {
            contentLength = Long.parseLong(contentLengthString);
        } catch (NumberFormatException | NullPointerException e) {
            // TODO
        }

        return contentLength;
    }

    private boolean shouldBodyBeLogged(String contentTypeHeader) {
        return !ContentType.APPLICATION_OCTET_STREAM.equalsIgnoreCase(contentTypeHeader);
    }

    private static Mono<ByteBuffer> writeBufferToBodyStream(WritableByteChannel channel, ByteBuffer byteBuffer) {
        try {
            channel.write(byteBuffer.duplicate());
            return Mono.just(byteBuffer);
        } catch (IOException ex) {
            return Mono.error(ex);
        }
    }

    private static String convertStreamToString(ByteArrayOutputStream stream) {
        try {
            return stream.toString("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            // TODO
            return "";
        }
    }
}
