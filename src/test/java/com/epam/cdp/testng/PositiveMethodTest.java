package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveMethodTest extends BasicTest {
    @Test (dataProvider = "valuesForPositiveTest")
    public void testPositiveValue(long a, boolean expectedValue){
        boolean result;
        result = calculator.isPositive(a);
        Assert.assertEquals(result,expectedValue);
    }

    @DataProvider (name = "valuesForPositiveTest")
    public Object[][] valuesForPositive() {
        return new Object[][]{
                {
                        20, true
                },
                {
                        0, false
                },
                {
                        -20, false
                }
        };


    }
    }

