package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareRootTest extends BasicTest {
    @Test
    public void extractRoot(){

        Assert.assertEquals(calculator.sqrt(6.4),2.5298221281347035, "Square root function works wrong");
    }
}
