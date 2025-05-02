package com.javatechie.calculator;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MainAppTest {

    @Test
    public void testValidAdditionInput_shouldPrintCorrectResult() {
        String input = "2\n3\n+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MainApp.main(null);

        String result = output.toString();
        assertTrue(result.contains("Result: 5"));
    }

    @Test
    public void testInvalidIntegerInput_shouldPrintErrorMessage() {
        String input = "abc\n3\n+\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MainApp.main(null);

        String result = output.toString();
        assertTrue(result.contains("Error: Input must be a valid integer."));
    }

    @Test
    public void testInvalidOperator_shouldPrintErrorMessage() {
        String input = "2\n3\n%\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MainApp.main(null);

        String result = output.toString();
        assertTrue(result.contains("Error: Operator must be one of +, -, *, /"));
    }

    @Test
    public void testDivideByZero_shouldPrintErrorMessage() {
        String input = "10\n0\n/\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        MainApp.main(null);

        String result = output.toString();
        assertTrue(result.contains("Error: Cannot divide by zero"));
    }
}
