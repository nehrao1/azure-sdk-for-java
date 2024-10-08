// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.fluent.models.Step;
import com.azure.resourcemanager.azurestackhci.fluent.models.UpdateRunInner;
import com.azure.resourcemanager.azurestackhci.models.UpdateRunList;
import com.azure.resourcemanager.azurestackhci.models.UpdateRunPropertiesState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateRunListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunList model = BinaryData.fromString(
            "{\"value\":[{\"location\":\"joylh\",\"properties\":{\"provisioningState\":\"PartiallySucceeded\",\"timeStarted\":\"2021-01-16T20:29:46Z\",\"lastUpdatedTime\":\"2021-08-30T04:34:11Z\",\"duration\":\"imrsopteecjmei\",\"state\":\"Failed\",\"progress\":{\"name\":\"asylwx\",\"description\":\"aumweoohguufu\",\"errorMessage\":\"oyjathwtzol\",\"status\":\"emwmdxmebwjs\",\"startTimeUtc\":\"2021-09-18T07:25:35Z\",\"endTimeUtc\":\"2021-04-09T17:42:24Z\",\"lastUpdatedTimeUtc\":\"2021-10-23T16:03:49Z\",\"expectedExecutionTime\":\"eabfqxnm\",\"steps\":[{},{},{}]}},\"id\":\"ibxyijddtvqc\",\"name\":\"tad\",\"type\":\"jaeukmrsieekpn\"}],\"nextLink\":\"aapm\"}")
            .toObject(UpdateRunList.class);
        Assertions.assertEquals("joylh", model.value().get(0).location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-16T20:29:46Z"), model.value().get(0).timeStarted());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-30T04:34:11Z"), model.value().get(0).lastUpdatedTime());
        Assertions.assertEquals("imrsopteecjmei", model.value().get(0).duration());
        Assertions.assertEquals(UpdateRunPropertiesState.FAILED, model.value().get(0).state());
        Assertions.assertEquals("asylwx", model.value().get(0).namePropertiesName());
        Assertions.assertEquals("aumweoohguufu", model.value().get(0).description());
        Assertions.assertEquals("oyjathwtzol", model.value().get(0).errorMessage());
        Assertions.assertEquals("emwmdxmebwjs", model.value().get(0).status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-18T07:25:35Z"), model.value().get(0).startTimeUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-09T17:42:24Z"), model.value().get(0).endTimeUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-23T16:03:49Z"),
            model.value().get(0).lastUpdatedTimeUtc());
        Assertions.assertEquals("eabfqxnm", model.value().get(0).expectedExecutionTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunList model = new UpdateRunList().withValue(Arrays.asList(new UpdateRunInner().withLocation("joylh")
            .withTimeStarted(OffsetDateTime.parse("2021-01-16T20:29:46Z"))
            .withLastUpdatedTime(OffsetDateTime.parse("2021-08-30T04:34:11Z"))
            .withDuration("imrsopteecjmei")
            .withState(UpdateRunPropertiesState.FAILED)
            .withNamePropertiesName("asylwx")
            .withDescription("aumweoohguufu")
            .withErrorMessage("oyjathwtzol")
            .withStatus("emwmdxmebwjs")
            .withStartTimeUtc(OffsetDateTime.parse("2021-09-18T07:25:35Z"))
            .withEndTimeUtc(OffsetDateTime.parse("2021-04-09T17:42:24Z"))
            .withLastUpdatedTimeUtc(OffsetDateTime.parse("2021-10-23T16:03:49Z"))
            .withExpectedExecutionTime("eabfqxnm")
            .withSteps(Arrays.asList(new Step(), new Step(), new Step()))));
        model = BinaryData.fromObject(model).toObject(UpdateRunList.class);
        Assertions.assertEquals("joylh", model.value().get(0).location());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-16T20:29:46Z"), model.value().get(0).timeStarted());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-30T04:34:11Z"), model.value().get(0).lastUpdatedTime());
        Assertions.assertEquals("imrsopteecjmei", model.value().get(0).duration());
        Assertions.assertEquals(UpdateRunPropertiesState.FAILED, model.value().get(0).state());
        Assertions.assertEquals("asylwx", model.value().get(0).namePropertiesName());
        Assertions.assertEquals("aumweoohguufu", model.value().get(0).description());
        Assertions.assertEquals("oyjathwtzol", model.value().get(0).errorMessage());
        Assertions.assertEquals("emwmdxmebwjs", model.value().get(0).status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-18T07:25:35Z"), model.value().get(0).startTimeUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-09T17:42:24Z"), model.value().get(0).endTimeUtc());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-23T16:03:49Z"),
            model.value().get(0).lastUpdatedTimeUtc());
        Assertions.assertEquals("eabfqxnm", model.value().get(0).expectedExecutionTime());
    }
}
