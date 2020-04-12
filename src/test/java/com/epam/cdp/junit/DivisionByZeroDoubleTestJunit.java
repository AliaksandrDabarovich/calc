package com.epam.cdp.junit;

import org.junit.Test;

public class DivisionByZeroDoubleTestJunit extends BasicTestJunit {
    @Test (expected=NumberFormatException.class)
    public void divideByZeroJunit(){
        double result;
        result = calculator.div(5.1,0);
    }
}
