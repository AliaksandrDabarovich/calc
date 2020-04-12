package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationDoubleTestJunit extends BasicTestJunit {
    @Test
    public void multiplicateDoubleJunit(){
        double result;
        result = calculator.mult(1.3, 2.2);
        Assert.assertEquals(2.86,result,0.1);
    }
}
