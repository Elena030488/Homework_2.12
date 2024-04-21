package pro.sky.Homework_2._Testing.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.Homework_2._Testing.exception.ZeroDivisionException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.Homework_2._Testing.CalculatorConstants.*;

class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectPlus(int num1, int num2) {
        assertEquals(num1 + num2, calculatorService.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMinus(int num1, int num2) {
        assertEquals(num1 - num2, calculatorService.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, calculatorService.divide(num1, num2));
    }

    @Test
    void shouldThrowZeroDivisionException() {
        assertThrows(ZeroDivisionException.class,() -> calculatorService.divide(three, zero));
    }
    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(one, zero),
                Arguments.of(one, two),
                Arguments.of(two, three),
                Arguments.of(three, four),
                Arguments.of(two, three),
                Arguments.of(four, one)
        );
    }
}