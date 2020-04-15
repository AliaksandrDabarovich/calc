package com.epam.cdp.testng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeMethodTest extends BasicTest {
    @Test(dataProvider = "values", dataProviderClass = DataProviderForTests.class)
    public void testNegativeValue(long a, boolean expectedValue) {

        Assert.assertEquals(calculator.isNegative(a), expectedValue, "isNegative function works wrong");
    }
}

