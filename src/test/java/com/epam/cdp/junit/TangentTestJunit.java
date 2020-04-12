package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class TangentTestJunit extends BasicTestJunit {
    @Test
    public void getTangentJunit(){
        double result;
        result = calculator.tg(60.5);
        Assert.assertEquals(1.0499075136648721,result, 0.0000000000000001);
    }
}
