package com.azure.analytics.purview.catalog;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.Random;

public class GlossaryImportTerms {
    public static void main(String[] args) {

        GlossaryClient client =
            new PurviewCatalogClientBuilder()
                .endpoint(System.getenv("ENDPOINT"))
                .credential(new DefaultAzureCredentialBuilder().build())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .buildGlossaryClient();
        BinaryData binaryData = BinaryData.fromString("Name,Nick Name,Status,Definition,Acronym,Resources,Related Terms,Synonyms,Stewards,Experts,Parent Term Name\n" +
            "Parent Name 1_Parent Name 2_Term Name 1,Term Name 1,Draft,Definition of Term Name 1,TN1,Purview Project:https://web.purview.azure.com;Azure portal:https://portal.azure.com;,Term Name 4;Parent Term 2_Term Name 5;,Term Name 2;Parent Name 1_Term Name 3;,,,Parent Name 1_Parent Name 2\n");
        binaryData = BinaryData.fromString("--WebKitFormBoundarySfdITjdkB9iBsA0A\n" +
            "Content-Disposition: form-data; name=\"file\"\n" +
            "Content-Type: text/plain\n\n" +
            binaryData +
            "\n--WebKitFormBoundarySfdITjdkB9iBsA0A--");
        System.out.println(binaryData);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setHeader("Content-Type", "multipart/form-data; boundary=WebKitFormBoundarySfdITjdkB9iBsA0A");
        requestOptions.addQueryParam("includeTermHierarchy", "true");
        client.beginImportGlossaryTermsViaCsvByGlossaryName("Glossary", binaryData, requestOptions, Context.NONE).getFinalResult();
    }
}
