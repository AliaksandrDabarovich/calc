package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationDoubleTest extends BasicTest {

    @Test
    public void summarizeDouble(){
        double result;
        result = calculator.sum(1.2, 5.4);
        Assert.assertEquals(result, 5.4+1.2);
    }
}
