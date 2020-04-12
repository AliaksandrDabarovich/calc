package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class SquareRootTestJunit extends BasicTestJunit {
    @Test
    public void extractRootJunit(){
        double result;
        result = calculator.sqrt(6.4);
        Assert.assertEquals(2.5298221281347035,result,0.0000000000000001);
    }
}
