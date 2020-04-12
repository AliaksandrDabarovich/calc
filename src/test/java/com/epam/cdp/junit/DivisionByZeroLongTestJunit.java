package com.epam.cdp.junit;

import org.junit.Test;

public class DivisionByZeroLongTestJunit extends BasicTestJunit {
    @Test (expected = NumberFormatException.class)
    public void divideByZeroJunit(){
        long result;
        result = calculator.div(8,0);
    }
}
