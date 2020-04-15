package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationLongTest extends BasicTest{

    @Test
    public void summarizeLong(){

        Assert.assertEquals(calculator.sum(1,2), 3, "Summation long function works wrong");
    }


}
