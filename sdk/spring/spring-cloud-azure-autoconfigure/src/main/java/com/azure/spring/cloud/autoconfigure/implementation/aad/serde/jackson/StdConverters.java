// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.autoconfigure.implementation.aad.serde.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.springframework.security.oauth2.core.AuthenticationMethod;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;

import static com.azure.spring.cloud.autoconfigure.implementation.aad.security.constants.Constants.ON_BEHALF_OF;

final class StdConverters {

    private static final String FIELD_NAME_OF_VALUE = "value";

    private StdConverters() {
    }

    static final class ClientAuthenticationMethodConverter extends StdConverter<JsonNode, ClientAuthenticationMethod> {

        @Override
        public ClientAuthenticationMethod convert(JsonNode jsonNode) {
            String value = JsonNodeUtils.findStringValue(jsonNode, FIELD_NAME_OF_VALUE);
            if (ClientAuthenticationMethod.CLIENT_SECRET_BASIC.getValue().equalsIgnoreCase(value)) {
                return ClientAuthenticationMethod.CLIENT_SECRET_BASIC;
            }
            if (ClientAuthenticationMethod.CLIENT_SECRET_POST.getValue().equalsIgnoreCase(value)) {
                return ClientAuthenticationMethod.CLIENT_SECRET_POST;
            }
            if (ClientAuthenticationMethod.PRIVATE_KEY_JWT.getValue().equalsIgnoreCase(value)) {
                return ClientAuthenticationMethod.PRIVATE_KEY_JWT;
            }
            if (ClientAuthenticationMethod.NONE.getValue().equalsIgnoreCase(value)) {
                return ClientAuthenticationMethod.NONE;
            }
            return null;
        }

    }

    static final class AuthorizationGrantTypeConverter extends StdConverter<JsonNode, AuthorizationGrantType> {

        @Override
        public AuthorizationGrantType convert(JsonNode jsonNode) {
            String value = JsonNodeUtils.findStringValue(jsonNode, FIELD_NAME_OF_VALUE);
            if (AuthorizationGrantType.AUTHORIZATION_CODE.getValue().equalsIgnoreCase(value)) {
                return AuthorizationGrantType.AUTHORIZATION_CODE;
            }
            if (AuthorizationGrantType.CLIENT_CREDENTIALS.getValue().equalsIgnoreCase(value)) {
                return AuthorizationGrantType.CLIENT_CREDENTIALS;
            }
            if (AuthorizationGrantType.JWT_BEARER.getValue().equalsIgnoreCase(value)
                || ON_BEHALF_OF.getValue().equalsIgnoreCase(value)) {
                return AuthorizationGrantType.JWT_BEARER;
            }
            return new AuthorizationGrantType(value);
        }

    }

    static final class AuthenticationMethodConverter extends StdConverter<JsonNode, AuthenticationMethod> {

        @Override
        public AuthenticationMethod convert(JsonNode jsonNode) {
            String value = JsonNodeUtils.findStringValue(jsonNode, FIELD_NAME_OF_VALUE);
            if (AuthenticationMethod.HEADER.getValue().equalsIgnoreCase(value)) {
                return AuthenticationMethod.HEADER;
            }
            if (AuthenticationMethod.FORM.getValue().equalsIgnoreCase(value)) {
                return AuthenticationMethod.FORM;
            }
            if (AuthenticationMethod.QUERY.getValue().equalsIgnoreCase(value)) {
                return AuthenticationMethod.QUERY;
            }
            return null;
        }

    }

}
