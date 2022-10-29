package com.niit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int firstNumber = 50;
        int secondNumber = 100;
        int expectedResult = 150;
        int actualResult = calculator.add(firstNumber,secondNumber);
        Assertions.assertEquals(expectedResult,actualResult,"the expected value and the actual value does not match");
    }

    @Test
    void subtract() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 20;
        int actualResult = calculator.subtract(firstNumber,secondNumber);
        Assertions.assertEquals(expectedResult, actualResult, "the expected value and the actual value does not match");

    }

    @Test
    void multiply() {
        // arrange, arrange all the values you need to call the method you want to test
        int a = 0;
        int b = 142;
        int expectedResult = 0;
        // act
        int actualResult = calculator.multiply(a,b);
        // assert
        Assertions.assertEquals(expectedResult, actualResult, "the expected value and the actual value does not match");
    }


    @Test
    void division() {
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = calculator.division(firstNumber,secondNumber);
        Assertions.assertEquals(expectedResult, actualResult, "the expected value and the actual value does not match");

    }

    @Test
    void modulo() {
        int firstNumber = 19;
        int secondNumber = 2;
        int expectedResult = 1;
        int actualResult = calculator.modulo(firstNumber,secondNumber);
        Assertions.assertEquals(expectedResult, actualResult, "the expected value and the actual value does not match");

    }
}