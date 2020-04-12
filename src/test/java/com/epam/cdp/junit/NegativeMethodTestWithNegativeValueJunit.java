package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class NegativeMethodTestWithNegativeValueJunit extends BasicTestJunit {
    @Test
    public void testNegativeValueJunit(){
        boolean result;
        result = calculator.isNegative(-5);
        Assert.assertTrue(result);
    }
}
