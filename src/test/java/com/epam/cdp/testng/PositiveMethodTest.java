package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveMethodTest extends BasicTest {
    @Test(dataProvider = "valuesForPositiveTest", dataProviderClass = DataProviderForTests.class)
    public void testPositiveValue(long a, boolean expectedValue) {

        Assert.assertEquals(calculator.isPositive(a), expectedValue, "isPositive function works wrong");
    }
}

