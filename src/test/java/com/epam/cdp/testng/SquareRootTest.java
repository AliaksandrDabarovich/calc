package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareRootTest extends BasicTest {
    @Test
    public void extractRoot(){
        double result;
        result = calculator.sqrt(6.4);
        Assert.assertEquals(result,2.5298221281347035);
    }
}
