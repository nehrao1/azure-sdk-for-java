// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ArmResourceId;
import com.azure.resourcemanager.machinelearning.models.UserCreatedStorageAccount;
import org.junit.jupiter.api.Assertions;

public final class UserCreatedStorageAccountTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserCreatedStorageAccount model = BinaryData.fromString("{\"armResourceId\":{\"resourceId\":\"rfmzhwilz\"}}")
            .toObject(UserCreatedStorageAccount.class);
        Assertions.assertEquals("rfmzhwilz", model.armResourceId().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserCreatedStorageAccount model
            = new UserCreatedStorageAccount().withArmResourceId(new ArmResourceId().withResourceId("rfmzhwilz"));
        model = BinaryData.fromObject(model).toObject(UserCreatedStorageAccount.class);
        Assertions.assertEquals("rfmzhwilz", model.armResourceId().resourceId());
    }
}
