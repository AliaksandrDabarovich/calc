package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationLongTestJunit extends BasicTestJunit {
    @Test
    public void multiplicateLongJunit (){
        long result;
        result = calculator.mult(4,5);
        Assert.assertEquals(20,result);
    }
}
