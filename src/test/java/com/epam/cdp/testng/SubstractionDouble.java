package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstractionDouble extends BasicTest {

    @Test
    public void substractDouble(){

        Assert.assertEquals(calculator.sub(5.5, 3.1), 2.4,0.01,"Substraction double function works wrong");
    }

}
