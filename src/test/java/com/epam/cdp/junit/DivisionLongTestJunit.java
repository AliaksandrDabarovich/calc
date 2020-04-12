package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class DivisionLongTestJunit extends BasicTestJunit {
    @Test
    public void divideLongJunit(){
        long result;
        result = calculator.div(8,2);
        Assert.assertEquals(4,result);
    }

}
