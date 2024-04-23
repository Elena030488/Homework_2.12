package pro.sky.Homework_2._Testing.service;

import org.springframework.stereotype.Service;
import pro.sky.Homework_2._Testing.exception.ZeroDivisionException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new ZeroDivisionException();
        }
        return num1 / num2;
    }
}
