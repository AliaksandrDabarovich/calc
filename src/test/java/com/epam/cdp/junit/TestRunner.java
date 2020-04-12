package com.epam.cdp.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CosinusTestJunit.class,
                CotangentTestJunit.class,
                DivisionByZeroDoubleTestJunit.class,
                DivisionByZeroLongTestJunit.class,
                DivisionDoubleTestJunit.class,
                DivisionLongTestJunit.class,
                MultiplicationDoubleTestJunit.class,
                MultiplicationLongTestJunit.class,
                NegativeMethodTestWithNegativeValueJunit.class,
                NegativeMethodTestWithNotNegativeValuesJunit.class,
                PositiveMethodTestWithNotPositiveValuesJunit.class,
                PositiveMethodTestWithPositiveValueJunit.class,
                PowerTestJunit.class,
                SinusTestJunit.class,
                SquareRootTestJunit.class,
                SubstractionDoubleJunit.class,
                SubstractionLongTestJunit.class,
                SummationDoubleTestJunit.class,
                SummationLongTestJunit.class,
                TangentTestJunit.class
        }
)

public class TestRunner {

}
