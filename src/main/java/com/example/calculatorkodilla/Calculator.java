package com.example.calculatorkodilla;

public class Calculator {
//    private int a;
//    private int b;
    private int result;

//    public Calculator(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public int plus(int a, int b) {
        result = a + b;
        System.out.println("The result of add is: " + result);
        return result;
    }

    public int minus(int a, int b) {
        result = a - b;
        System.out.println("The result of add is: " + result);
        return result;
    }
}
