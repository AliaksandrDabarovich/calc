package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstractionLongTest extends BasicTest{
    @Test
    public void substractLong (){
        long result = calculator.sub(3,2);
        Assert.assertEquals(result, 1);
    }
}
