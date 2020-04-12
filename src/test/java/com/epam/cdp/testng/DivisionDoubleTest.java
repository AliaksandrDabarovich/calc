package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionDoubleTest extends BasicTest {
    @Test
    public void divideDouble (){
        double result;
        result = calculator.div(6.4,3.5);
        Assert.assertEquals(result, 1.828571428571429, 0.000000000000001);
    }
}
