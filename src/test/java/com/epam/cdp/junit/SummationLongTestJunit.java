package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SummationLongTestJunit extends BasicTestJunit {
    @Test
    public void summarizeLongJunit(){
        long result = calculator.sum(1,2);
        Assert.assertEquals(3,result);
    }
}
