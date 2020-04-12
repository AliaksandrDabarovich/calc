package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerTest extends BasicTest {
    @Test
    public void raiseToPower (){
        double result;
        result = calculator.pow(1.8, 6.7);
        Assert.assertEquals(result, 51.3246249152,0.0000000001);
    }
}
