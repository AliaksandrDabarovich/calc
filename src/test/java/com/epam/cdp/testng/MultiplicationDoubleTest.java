package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationDoubleTest extends BasicTest {
    @Test (groups = {"includeGroup"})
    public void multiplicateDouble (){
        double result;
        result = calculator.mult(1.3, 2.2);
        Assert.assertEquals(result, 2.86,0.1);
    }
}
