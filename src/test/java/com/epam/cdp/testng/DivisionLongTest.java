package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionLongTest extends BasicTest {
    @Test
    public void divideLong(){
        long result;
        result = calculator.div(8,2);
        Assert.assertEquals(result,4);
    }


}
