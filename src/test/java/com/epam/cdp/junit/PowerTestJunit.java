package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class PowerTestJunit extends BasicTestJunit {
    @Test
    public void raiseToPowerJunit(){
        double result;
        result = calculator.pow(1.8, 6.7);
        Assert.assertEquals(51.3246249152, result,0.0000000001);
    }
}
