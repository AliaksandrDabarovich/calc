package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationLongTest extends BasicTest {
    @Test
    public void multiplicateLong (){
        long result;
        result = calculator.mult(4,5);
        Assert.assertEquals(result,20);
    }
}
