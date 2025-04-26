package com.javatechie.calculator;

import java.util.Scanner;
import java.util.Stack;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your expression (e.g., 5 + 4 * 8 - 10 / 2): ");
            String expression = scanner.nextLine().trim();

            if (expression.isEmpty()) {
                throw new IllegalArgumentException("No input provided.");
            }

            int result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.isEmpty()) continue;
            
            if (isOperator(token.charAt(0))) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(token.charAt(0))) {
                    computeTop(numbers, operators);
                }
                operators.push(token.charAt(0));
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }

        while (!operators.isEmpty()) {
            computeTop(numbers, operators);
        }

        return numbers.pop();
    }

    private static void computeTop(Stack<Integer> numbers, Stack<Character> operators) {
        int b = numbers.pop();
        int a = numbers.pop();
        char op = operators.pop();

        int result = Computation.compute(a, b, String.valueOf(op));
        numbers.push(result);
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}
