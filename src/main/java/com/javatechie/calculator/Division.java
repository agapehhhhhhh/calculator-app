package com.javatechie.calculator;

public class Division implements Operation {
    @Override
    public int calculate(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}