// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner;
import com.azure.resourcemanager.appcontainers.models.AuthPlatform;
import com.azure.resourcemanager.appcontainers.models.GlobalValidation;
import com.azure.resourcemanager.appcontainers.models.HttpSettings;
import com.azure.resourcemanager.appcontainers.models.IdentityProviders;
import com.azure.resourcemanager.appcontainers.models.Login;
import com.azure.resourcemanager.appcontainers.models.UnauthenticatedClientActionV2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AuthConfigInnerTests {
    @Test
    public void testDeserialize() {
        AuthConfigInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"platform\":{\"enabled\":false,\"runtimeVersion\":\"jnqglhqgnu\"},\"globalValidation\":{\"unauthenticatedClientAction\":\"Return401\",\"redirectToProvider\":\"ywifsqesaag\",\"excludedPaths\":[\"glzlhjxrifkwmrv\",\"tsizntocipaoua\"]},\"identityProviders\":{\"customOpenIdConnectProviders\":{}},\"login\":{\"preserveUrlFragmentsForLogins\":true,\"allowedExternalRedirectUrls\":[\"nygj\",\"fjddeqs\",\"deupewnwrei\"]},\"httpSettings\":{\"requireHttps\":false}},\"id\":\"rh\",\"name\":\"ofcqhsm\",\"type\":\"urkdtmlx\"}")
                .toObject(AuthConfigInner.class);
        Assertions.assertEquals(false, model.platform().enabled());
        Assertions.assertEquals("jnqglhqgnu", model.platform().runtimeVersion());
        Assertions
            .assertEquals(
                UnauthenticatedClientActionV2.RETURN401, model.globalValidation().unauthenticatedClientAction());
        Assertions.assertEquals("ywifsqesaag", model.globalValidation().redirectToProvider());
        Assertions.assertEquals("glzlhjxrifkwmrv", model.globalValidation().excludedPaths().get(0));
        Assertions.assertEquals(true, model.login().preserveUrlFragmentsForLogins());
        Assertions.assertEquals("nygj", model.login().allowedExternalRedirectUrls().get(0));
        Assertions.assertEquals(false, model.httpSettings().requireHttps());
    }

    @Test
    public void testSerialize() {
        AuthConfigInner model =
            new AuthConfigInner()
                .withPlatform(new AuthPlatform().withEnabled(false).withRuntimeVersion("jnqglhqgnu"))
                .withGlobalValidation(
                    new GlobalValidation()
                        .withUnauthenticatedClientAction(UnauthenticatedClientActionV2.RETURN401)
                        .withRedirectToProvider("ywifsqesaag")
                        .withExcludedPaths(Arrays.asList("glzlhjxrifkwmrv", "tsizntocipaoua")))
                .withIdentityProviders(new IdentityProviders().withCustomOpenIdConnectProviders(mapOf()))
                .withLogin(
                    new Login()
                        .withPreserveUrlFragmentsForLogins(true)
                        .withAllowedExternalRedirectUrls(Arrays.asList("nygj", "fjddeqs", "deupewnwrei")))
                .withHttpSettings(new HttpSettings().withRequireHttps(false));
        model = BinaryData.fromObject(model).toObject(AuthConfigInner.class);
        Assertions.assertEquals(false, model.platform().enabled());
        Assertions.assertEquals("jnqglhqgnu", model.platform().runtimeVersion());
        Assertions
            .assertEquals(
                UnauthenticatedClientActionV2.RETURN401, model.globalValidation().unauthenticatedClientAction());
        Assertions.assertEquals("ywifsqesaag", model.globalValidation().redirectToProvider());
        Assertions.assertEquals("glzlhjxrifkwmrv", model.globalValidation().excludedPaths().get(0));
        Assertions.assertEquals(true, model.login().preserveUrlFragmentsForLogins());
        Assertions.assertEquals("nygj", model.login().allowedExternalRedirectUrls().get(0));
        Assertions.assertEquals(false, model.httpSettings().requireHttps());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}