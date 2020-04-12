package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CotangentTest extends BasicTest {
    @Test(groups = {"excludeGroup"})
    public void getCotangent (){
        double result;
        result = calculator.ctg(15.3);
        Assert.assertEquals(result, -2.313680128984687);
    }
}
