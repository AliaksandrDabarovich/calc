package com.epam.cdp.testng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeMethodTest extends BasicTest {
    @Test(dataProvider = "valuesNegative")
    public void testNegativeValue(long a, boolean expectedValue) {
        boolean result;
        result = calculator.isNegative(a);
        Assert.assertEquals(result, expectedValue);
    }

    @DataProvider (name = "valuesNegative")
    public Object[][] valuesForNegative() {
        return new Object[][]{
                {
                        1, false
                },
                {
                        0, false
                },
                {
                        -1, true
                }
        };
    }
}

