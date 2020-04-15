package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CotangentTest extends BasicTest {
    @Test(groups = "excludeGroup")
    public void getCotangent() {
        Assert.assertEquals(calculator.ctg(15.3), -2.313680128984687, "Cotangent function works wrong");
    }
}
