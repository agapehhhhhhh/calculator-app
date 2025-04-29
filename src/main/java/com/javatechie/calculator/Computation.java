package com.javatechie.calculator;

import java.util.HashMap;
import java.util.Map;

public class Computation {

    private static final Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put("+", new Addition());
        operations.put("-", new Subtraction());
        operations.put("*", new Multiplication());
        operations.put("/", new Division());
    }

    public static int compute(int a, int b, String operator) throws IllegalArgumentException {
        validateInput(a, b, operator);

        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Unsupported operator: " + operator);
        }

        return operation.calculate(a, b);
    }

    private static void validateInput(int a, int b, String operator) {
        if (a < -32768 || a > 32767 || b < -32768 || b > 32767) {
            throw new IllegalArgumentException("Operands must be between -32768 and 32767");
        }

        if (!operations.containsKey(operator)) {
            throw new IllegalArgumentException("Operator must be one of +, -, *, /");
        }

        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}