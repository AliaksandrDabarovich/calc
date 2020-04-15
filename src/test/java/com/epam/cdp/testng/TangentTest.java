package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TangentTest extends BasicTest {
    @Test
    public void getTangent() {

        Assert.assertEquals(calculator.tg(60.5), 1.0499075136648721, "Tangent function works wrong");
    }
}
