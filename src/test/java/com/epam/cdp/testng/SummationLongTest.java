package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationLongTest extends BasicTest{

    @Test
    public void summarizeLong(){
        long result = calculator.sum(1,2);
        Assert.assertEquals(result, 3);
    }


}
