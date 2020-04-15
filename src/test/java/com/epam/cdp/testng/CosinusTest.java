package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosinusTest extends BasicTest {
    @Test(groups = "excludeGroup")
    public void getCosinus(){
        Assert.assertEquals(calculator.cos(-4.7), -0.01238866346289056, "Cosinus function works wrong");
    }
}
