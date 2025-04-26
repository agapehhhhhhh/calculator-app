package com.javatechie.calculator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = scanner.nextLine();

            int result = Computation.compute(a, b, operator);

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
}
