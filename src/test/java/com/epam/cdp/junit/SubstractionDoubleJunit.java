package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SubstractionDoubleJunit extends BasicTestJunit {
    @Test
    public void substractDoubleJunit(){
        double result;
        result = calculator.sub(5.5, 3.1);
        Assert.assertEquals(2.4,result,0.01);
    }
}
