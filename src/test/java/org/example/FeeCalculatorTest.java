package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FeeCalculatorTest {

    @Test
    public void testCalculateFee() {

        FeeCalculator calculator = new FeeCalculator();

        double result = calculator.calculateFee(1000);

        assertEquals(20.0, result, 0.001);
    }

}


