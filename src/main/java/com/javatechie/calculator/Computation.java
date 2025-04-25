package com.javatechie.calculator;

public class Computation {

    public static int compute(int a, int b, String operator) throws IllegalArgumentException {
        validateInput(a, b, operator);
        
        switch (operator) {
            case "+":
                return Calculator.add(a, b);
            case "-":
                return Calculator.subtract(a, b);
            case "*":
                return Calculator.multiply(a, b);
            case "/":
                return Calculator.divide(a, b);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static void validateInput(int a, int b, String operator) {
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            throw new IllegalArgumentException("Operands must be between -32768 and 32767");
        }

        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
            throw new IllegalArgumentException("Operator must be one of +, -, *, /");
        }

        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
