package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinusTest extends BasicTest {
    @Test
    public void getSinus(){
        double result;
        result = calculator.cos(-20.7);
        Assert.assertEquals(result, -0.9611527245021165);
    }
}
