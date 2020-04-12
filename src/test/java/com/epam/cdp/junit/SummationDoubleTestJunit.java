package com.epam.cdp.junit;
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SummationDoubleTestJunit  extends BasicTestJunit{
    @Test
    public void summarizeDoubleTestJunit(){
        long result;
        result = calculator.sum(1,2);
        Assert.assertEquals(result,3);
    }



}
