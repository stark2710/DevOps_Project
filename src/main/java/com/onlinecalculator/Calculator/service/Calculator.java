package com.onlinecalculator.Calculator.service;

import org.springframework.context.annotation.Configuration;
//Comment to test
@Configuration
public class Calculator {
    public double CalculatorMethod(String num1, String num2, String operation){
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);

        switch(operation){
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                return n1/n2;
            case "%":
                return n1%n2;
            default:
                return -1.00D;        
        }
    }
}
