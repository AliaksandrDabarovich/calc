package com.epam.cdp.junit;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class NegativeMethodTestWithNotNegativeValuesJunit extends BasicTestJunit {
    @DataProvider
    public static Object[] valuesForNegativeTest() {
        return new Object[]{
                1, 0

        };
    }

    @Test
    @UseDataProvider("valuesForNegativeTest")
    public void testNotNegativeValueJunit(long a) {
        boolean result;
        result = calculator.isNegative(a);
        Assert.assertFalse(result);
    }


}
