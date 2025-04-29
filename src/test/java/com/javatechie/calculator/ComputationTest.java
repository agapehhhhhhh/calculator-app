package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputationTest {

    @Test
    public void testComputeAdd() {
        int result = Computation.compute(2, 3, "+");
        int expected = 5;
        assertEquals("Test failed: 2 + 3 should equal 5", expected, result);
    }

    @Test
    public void testComputeSubtract() {
        int result = Computation.compute(3, 2, "-");
        int expected = 1;
        assertEquals("Test failed: 3 - 2 should equal 1", expected, result);
    }

    @Test
    public void testComputeMultiply() {
        int result = Computation.compute(2, 3, "*");
        int expected = 6;
        assertEquals("Test failed: 2 * 3 should equal 6", expected, result);
    }

    @Test
    public void testComputeDivide() {
        int result = Computation.compute(6, 3, "/");
        int expected = 2;
        assertEquals("Test failed: 6 / 3 should equal 2", expected, result);
    }

    @Test
    public void testInvalidOperator() {
        try {
            Computation.compute(2, 3, "%");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operator must be one of +, -, *, /"));
        }
    }

    @Test
    public void testDivideByZero() {
        try {
            Computation.compute(1, 0, "/");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Cannot divide by zero"));
        }
    }

    @Test
    public void testOperandOutOfRange() {
        try {
            Computation.compute(40000, 2, "+");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue("Error message mismatch", e.getMessage().contains("Operands must be between -32768 and 32767"));
        }
    }
}
