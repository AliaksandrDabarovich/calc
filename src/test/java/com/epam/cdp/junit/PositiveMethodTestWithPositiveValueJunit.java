package com.epam.cdp.junit;

import com.epam.cdp.junit.BasicTestJunit;
import org.junit.Assert;
import org.junit.Test;

public class PositiveMethodTestWithPositiveValueJunit extends BasicTestJunit {
    @Test
    public void testPositiveValue (){
        boolean result;
        result = calculator.isPositive(1);
        Assert.assertTrue(result);
    }

}
