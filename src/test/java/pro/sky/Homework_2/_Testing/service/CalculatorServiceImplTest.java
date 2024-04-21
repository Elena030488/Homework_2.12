package pro.sky.Homework_2._Testing.service;

import org.junit.jupiter.api.Test;
import pro.sky.Homework_2._Testing.exception.ZeroDivisionException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.Homework_2._Testing.CalculatorConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void shouldReturnCorrectPlus() {
        assertEquals(one + two, calculatorService.plus(one, two));
    }
    @Test
    void shouldReturnCorrectPlus2() {
        assertEquals(three + four, calculatorService.plus(three, four));
    }

    @Test
    void shouldReturnCorrectMinus() {
        assertEquals(three - one, calculatorService.minus(three, one));
    }
    @Test
    void shouldReturnCorrectMinus2() {
        assertEquals(four - three, calculatorService.minus(four, three));
    }

    @Test
    void shouldReturnCorrectMultiply() {
        assertEquals(three * two, calculatorService.multiply(three, two));
    }
    @Test
    void shouldReturnCorrectMultiply2() {
        assertEquals(four * two, calculatorService.multiply(four, two));
    }

    @Test
    void shouldReturnCorrectDivide() {
        assertEquals(two / one, calculatorService.divide(two, one));
    }
    @Test
    void shouldReturnCorrectDivide2() {
        assertEquals(four / two, calculatorService.divide(four, one));
    }
    @Test
    void shouldThrowZeroDivisionException() {
        assertThrows(ZeroDivisionException.class,() -> calculatorService.divide(three, zero));
    }
}