package com.javatechie.calculator;

public class Multiplication implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}