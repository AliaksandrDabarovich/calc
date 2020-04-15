package com.epam.cdp.testng;
import org.testng.annotations.DataProvider;


public class DataProviderForTests {
    @DataProvider(name = "values")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{
                {
                        1, false
                },
                {
                        0, false
                },
                {
                        -1, true
                }
        };
    }

    @DataProvider (name = "valuesForPositiveTest")
    public Object[][] valuesForPositive() {
        return new Object[][]{
                {
                        20, true
                },
                {
                        0, false
                },
                {
                        -20, false
                }
        };


    }
}
