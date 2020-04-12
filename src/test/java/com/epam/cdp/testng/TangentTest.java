package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TangentTest extends BasicTest {
    @Test
    public void getTangent(){
        double result;
        result = calculator.tg(60.5);
        Assert.assertEquals(result, 1.0499075136648721);
    }
}
