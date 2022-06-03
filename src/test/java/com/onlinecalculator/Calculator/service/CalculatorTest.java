package com.onlinecalculator.Calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorTest {
    // @Autowired
    public Calculator calculator = new Calculator();
    @Test
    public void calculatorMethodTest(){
        double output = calculator.CalculatorMethod("5", "4", "+");
        assertEquals(9.0D,output, "Passed");
    }
}
