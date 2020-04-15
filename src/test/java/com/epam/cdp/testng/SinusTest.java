package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinusTest extends BasicTest {
    @Test
    public void getSinus(){

        Assert.assertEquals(calculator.cos(-20.7), -0.9611527245021165, "Sinus function works wrong");
    }
}
