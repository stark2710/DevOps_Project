package com.onlinecalculator.Calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinecalculator.Calculator.service.Calculator;

@RestController
@RequestMapping("/calculator")
public class calculationRequestHandler {

    @Autowired
    public Calculator calculator;

    @GetMapping("/helloWord")
    public String helloWorld2(){
       
        return "HelloWorld";
    }

    @GetMapping("/calculate/{num1}/{operation}/{num2}")
    public String helloWorld(@PathVariable("num1") String num1, @PathVariable("num2") String num2, @PathVariable("operation") String op) throws NumberFormatException{
        try {
            System.out.println(num1+" "+num2+" "+op);
            return Double.toString(calculator.CalculatorMethod(num1, num2, op));    
        } catch (Exception e) {
            //TODO: handle exception
            return "Invalid Input";

        }
        
    }


    
    
}
