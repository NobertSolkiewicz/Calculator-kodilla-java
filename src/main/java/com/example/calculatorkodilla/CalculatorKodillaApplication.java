package com.example.calculatorkodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorKodillaApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CalculatorKodillaApplication.class, args);
        Calculator calculator = new Calculator();
        calculator.plus(10, 5);
        calculator.minus(19, 18);
    }

}
