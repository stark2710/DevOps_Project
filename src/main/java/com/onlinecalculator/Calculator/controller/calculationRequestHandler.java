package com.onlinecalculator.Calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculationRequestHandler {

    
    @GetMapping("/helloWord")
    public String helloWorld2(){
       
        return "HelloWorld";
    }

    @GetMapping("/calculate/{num1}/{operation}/{num2}")
    public String helloWorld(@PathVariable("num1") String num1, @PathVariable("num2") String num2, @PathVariable("operation") String op) throws NumberFormatException{
        try {
            System.out.println(num1+" "+num2+" "+op);
            return Double.toString(Calculator(num1, num2, op));    
        } catch (Exception e) {
            //TODO: handle exception
            return "Invalid Input";

        }
        
    }


    public double Calculator(String num1, String num2, String operation){
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
