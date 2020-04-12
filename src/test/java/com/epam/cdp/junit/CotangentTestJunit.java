package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class CotangentTestJunit extends BasicTestJunit {
    @Test
    public void getCotangentJunit(){
        double result;
        result = calculator.ctg(15.3);
        Assert.assertEquals(-2.313680128984687, result,0.000000000000001);
    }
}
