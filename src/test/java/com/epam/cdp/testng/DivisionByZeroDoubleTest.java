package com.epam.cdp.testng;

import org.testng.annotations.Test;

public class DivisionByZeroDoubleTest extends BasicTest {
    @Test (expectedExceptions = NumberFormatException.class, groups = "excludeGroup")
    public void divideByZero(){
        calculator.div(5.1,0);
    }
}
