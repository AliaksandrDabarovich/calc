package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstractionLongTest extends BasicTest{
    @Test
    public void substractLong (){

        Assert.assertEquals(calculator.sub(3,2), 1, "Substraction long function works wrong");
    }
}
