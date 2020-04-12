package com.epam.cdp.junit;

import org.junit.Assert;
import org.junit.Test;

public class CosinusTestJunit  extends BasicTestJunit{
    @Test
    public void getCosinusJunit(){
        double result;
        result = calculator.cos(-4.7);
        Assert.assertEquals(-0.01238866346289056,result,0.00000000000000001);

    }
}
