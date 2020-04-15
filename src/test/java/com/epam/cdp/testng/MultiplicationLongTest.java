package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationLongTest extends BasicTest {
    @Test
    public void multiplicateLong (){

        Assert.assertEquals(calculator.mult(4,5),20, "Multiplication with long function works wrong");
    }
}
