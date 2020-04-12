package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class DivisionDoubleTestJunit extends BasicTestJunit {
    @Test
    public void divideDoubleJunit(){
        Double result;
        result = calculator.div(6.4,3.5);
        Assert.assertEquals(1.828571428571429, result,0.000000000000001);
    }
}
