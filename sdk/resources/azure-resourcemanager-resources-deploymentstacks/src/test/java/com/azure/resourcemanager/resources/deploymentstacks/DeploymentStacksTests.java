// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.resources.deploymentstacks;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.annotation.LiveOnly;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.identity.AzurePowerShellCredentialBuilder;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.resources.deploymentstacks.models.ActionOnUnmanage;
import com.azure.resourcemanager.resources.deploymentstacks.models.DenySettings;
import com.azure.resourcemanager.resources.deploymentstacks.models.DenySettingsMode;
import com.azure.resourcemanager.resources.deploymentstacks.models.DeploymentStack;
import com.azure.resourcemanager.resources.deploymentstacks.models.DeploymentStackProperties;
import com.azure.resourcemanager.resources.deploymentstacks.models.DeploymentStacksDeleteDetachEnum;
import com.azure.resourcemanager.resources.deploymentstacks.models.DeploymentStacksParametersLink;
import com.azure.resourcemanager.resources.deploymentstacks.models.DeploymentStacksTemplateLink;
import com.azure.resourcemanager.resources.fluentcore.policy.ProviderRegistrationPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class DeploymentStacksTests extends TestProxyTestBase {
    private boolean testEnv;

    private static final Random RANDOM = new Random();
    private static final Region REGION = Region.US_WEST3;
    private String resourceGroupName = "rg" + randomPadding();

    private ResourceManager resourceManager;
    private DeploymentStacksManager deploymentStacksManager;

    private static final String TEMPLATE_URI
        = "https://raw.githubusercontent.com/Azure/azure-quickstart-templates/master/quickstarts/microsoft.network/vnet-two-subnets/azuredeploy.json";
    private static final String PARAMETERS_URI
        = "https://raw.githubusercontent.com/Azure/azure-quickstart-templates/master/quickstarts/microsoft.network/vnet-two-subnets/azuredeploy.parameters.json";
    private static final String CONTENT_VERSION = "1.0.0.0";

    @Override
    public void beforeTest() {
        final TokenCredential credential = new AzurePowerShellCredentialBuilder().build();
        final AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);

        resourceManager = ResourceManager.configure()
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile)
            .withDefaultSubscription();

        deploymentStacksManager = DeploymentStacksManager.configure()
            .withPolicy(new ProviderRegistrationPolicy(resourceManager))
            .withLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC))
            .authenticate(credential, profile);

        // use AZURE_RESOURCE_GROUP_NAME if run in LIVE CI
        String testResourceGroup = Configuration.getGlobalConfiguration().get("AZURE_RESOURCE_GROUP_NAME");
        testEnv = !CoreUtils.isNullOrEmpty(testResourceGroup);
        if (testEnv) {
            resourceGroupName = testResourceGroup;
        } else {
            resourceManager.resourceManager().resourceGroups().define(resourceGroupName).withRegion(REGION).create();
        }
    }

    @Override
    protected void afterTest() {
        if (!testEnv) {
            resourceManager.resourceGroups().beginDeleteByName(resourceGroupName);
        }
    }

    @Test
    @LiveOnly
    public void testDeploymentStacks() {
        final String deploymentStackName = "dpA" + randomPadding();

        DeploymentStack deploymentStack;
        try {
            // Create a deployment stack
            // @embedmeStart
            deploymentStack = deploymentStacksManager.deploymentStacks()
                .define(deploymentStackName)
                .withExistingResourceGroup(resourceGroupName)
                .withRegion(REGION)
                .withProperties(new DeploymentStackProperties()
                    .withTemplateLink(
                        new DeploymentStacksTemplateLink().withUri(TEMPLATE_URI).withContentVersion(CONTENT_VERSION))
                    .withParametersLink(new DeploymentStacksParametersLink().withUri(PARAMETERS_URI)
                        .withContentVersion(CONTENT_VERSION))
                    .withActionOnUnmanage(new ActionOnUnmanage().withResources(DeploymentStacksDeleteDetachEnum.DELETE)
                        .withResourceGroups(DeploymentStacksDeleteDetachEnum.DETACH)
                        .withManagementGroups(DeploymentStacksDeleteDetachEnum.DETACH))
                    .withDenySettings(new DenySettings().withMode(DenySettingsMode.NONE)))
                .create();
            // @embedmeEnd

            deploymentStack.refresh();
            Assertions.assertEquals(deploymentStack.name(), deploymentStackName);
            Assertions.assertEquals(deploymentStack.name(),
                deploymentStacksManager.deploymentStacks().getById(deploymentStack.id()).name());
            Assertions.assertTrue(deploymentStacksManager.deploymentStacks().list().stream().count() > 0);
        } finally {
            if (deploymentStack != null) {
                deploymentStacksManager.deploymentStacks().deleteById(deploymentStack.id());
            }
        }
    }

    private static String randomPadding() {
        return String.format("%05d", Math.abs(RANDOM.nextInt() % 100000));
    }
}
