package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
