package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SubstractionLongTestJunit extends BasicTestJunit {
    @Test
    public void substractLongJunit(){
        long result = calculator.sub(3,2);
        Assert.assertEquals(1,result);
    }
}
