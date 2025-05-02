package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ComputationTest {


    @Test
    public void computeAddition_shouldReturnCorrectResult() {
        // (1) setup
        int a = 2, b = 3;
        String op = "+";
        int expected = 5;

        // (2) exercise
        int actual = Computation.compute(a, b, op);

        // (3) verify
        assertEquals("2 + 3 should equal 5", expected, actual);
    }

    @Test
    public void computeSubtraction_shouldReturnCorrectResult() {
        int a = 3, b = 2;
        String op = "-";
        int expected = 1;

        int actual = Computation.compute(a, b, op);

        assertEquals("3 - 2 should equal 1", expected, actual);
    }

    @Test
    public void computeMultiplication_shouldReturnCorrectResult() {
        int a = 2, b = 3;
        String op = "*";
        int expected = 6;

        int actual = Computation.compute(a, b, op);

        assertEquals("2 * 3 should equal 6", expected, actual);
    }

    @Test
    public void computeDivision_shouldReturnCorrectResult() {
        int a = 6, b = 3;
        String op = "/";
        int expected = 2;

        int actual = Computation.compute(a, b, op);

        assertEquals("6 / 3 should equal 2", expected, actual);
    }

    @Test
    public void computeWithInvalidOperator_shouldThrowException() {
        int a = 2, b = 3;
        String op = "%";

        try {
            Computation.compute(a, b, op);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operator must be one of +, -, *, /"));
        }
    }

    @Test
    public void computeDivisionByZero_shouldThrowException() {
        int a = 1, b = 0;
        String op = "/";

        try {
            Computation.compute(a, b, op);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Cannot divide by zero"));
        }
    }

    @Test
    public void computeWithOperandOutOfRange_shouldThrowException() {
        int a = 40000, b = 2;
        String op = "+";

        try {
            Computation.compute(a, b, op);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operands must be between -32768 and 32767"));
        }
    }

    @Test
    public void computeWithNullOperator_shouldThrowException() {
        int a = 2, b = 3;
        String op = null;

        try {
            Computation.compute(a, b, op);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Operator must be one of"));
        }
    }

    @Test
    public void computeWithEmptyOperator_shouldThrowException() {
        int a = 2, b = 3;
        String op = "";

        try {
            Computation.compute(a, b, op);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Operator must be one of"));
        }
    }
}
