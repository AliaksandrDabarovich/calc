package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SinusTestJunit extends BasicTestJunit {
    @Test
    public void getSinusJunit(){
        double result;
        result = calculator.cos(-20.7);
        Assert.assertEquals(-0.9611527245021165, result, 0.0000000000000001);
    }
}
