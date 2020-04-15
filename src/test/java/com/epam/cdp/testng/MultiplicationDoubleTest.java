package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationDoubleTest extends BasicTest {
    @Test (groups = {"includeGroup"})
    public void multiplicateDouble (){

        Assert.assertEquals(calculator.mult(1.3, 2.2), 2.86,0.1, "Multiplication with double function works wrong");
    }
}
