package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;


public class BasicTestJunit {
    Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @After
    public void tearDown(){
        calculator = null;
    }
}
