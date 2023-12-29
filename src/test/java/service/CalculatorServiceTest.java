package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceTest {

    @Test
    void givenTwoValues_whenSum_thenReturnTheSum() {
        // GIVEN -> DADO
        final double valueOne = 5.0D;
        final double valueTwo = 5.0D;
        final CalculatorService calculatorService = new CalculatorService();

        // WHEN -> QUANDO
        final double result = calculatorService.sum(valueOne, valueTwo);

        // THEN -> ENTÃO
        assertEquals(10.0D, result);
    }
}
