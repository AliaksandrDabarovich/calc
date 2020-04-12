package com.epam.cdp.junit;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class PositiveMethodTestWithNotPositiveValuesJunit extends BasicTestJunit {
    @DataProvider
    public static Object[] valuesForPositiveTest() {
        return new Object[]{
                0, -20

        };
    }

    @Test
    @UseDataProvider("valuesForPositiveTest")
    public void testNotPositiveValue(long a) {
        boolean result;
        result = calculator.isPositive(a);
        Assert.assertFalse(result);
    }


}
