package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionLongTest extends BasicTest {
    @Test
    public void divideLong() {
        Assert.assertEquals(calculator.div(8, 2), 4, "Division with long function works wrong");
    }


}
