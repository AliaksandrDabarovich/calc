package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationDoubleTest extends BasicTest {

    @Test
    public void summarizeDouble(){

        Assert.assertEquals(calculator.sum(1.2, 5.4), 5.4+1.2, "Summation double function works wrong");
    }
}
