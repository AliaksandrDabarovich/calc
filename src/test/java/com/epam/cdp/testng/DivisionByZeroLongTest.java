package com.epam.cdp.testng;

import org.testng.annotations.Test;

public class DivisionByZeroLongTest extends BasicTest {
    @Test (expectedExceptions = NumberFormatException.class)
    public void divideByZero (){
        calculator.div(8,0);
    }
}
