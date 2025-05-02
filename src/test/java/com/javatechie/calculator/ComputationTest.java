package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputationTest {

    @Test
    public void computeAddition_shouldReturnCorrectResult() {
        int result = Computation.compute(2, 3, "+");
        int expected = 5;
        assertEquals("2 + 3 should equal 5", expected, result);
    }

    @Test
    public void computeSubtraction_shouldReturnCorrectResult() {
        int result = Computation.compute(3, 2, "-");
        int expected = 1;
        assertEquals("3 - 2 should equal 1", expected, result);
    }

    @Test
    public void computeMultiplication_shouldReturnCorrectResult() {
        int result = Computation.compute(2, 3, "*");
        int expected = 6;
        assertEquals("2 * 3 should equal 6", expected, result);
    }

    @Test
    public void computeDivision_shouldReturnCorrectResult() {
        int result = Computation.compute(6, 3, "/");
        int expected = 2;
        assertEquals("6 / 3 should equal 2", expected, result);
    }

    @Test
    public void computeWithInvalidOperator_shouldThrowException() {
        try {
            Computation.compute(2, 3, "%");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operator must be one of +, -, *, /"));
        }
    }

    @Test
    public void computeDivisionByZero_shouldThrowException() {
        try {
            Computation.compute(1, 0, "/");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Cannot divide by zero"));
        }
    }

    @Test
    public void computeWithOperandOutOfRange_shouldThrowException() {
        try {
            Computation.compute(40000, 2, "+");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operands must be between -32768 and 32767"));
        }
    }

    @Test
    public void computeWithNullOperator_shouldThrowException() {
        try {
            Computation.compute(2, 3, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Operator must be one of"));
        }
    }

    @Test
    public void computeWithEmptyOperator_shouldThrowException() {
        try {
            Computation.compute(2, 3, "");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Operator must be one of"));
        }
    }
}
