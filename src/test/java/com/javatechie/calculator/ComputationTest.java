package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComputationTest {

    @Test
    public void testComputeAdd() {
        assertEquals(5, Computation.compute(2, 3, "+"));
    }

    @Test
    public void testComputeSubtract() {
        assertEquals(1, Computation.compute(3, 2, "-"));
    }

    @Test
    public void testComputeMultiply() {
        assertEquals(6, Computation.compute(2, 3, "*"));
    }

    @Test
    public void testComputeDivide() {
        assertEquals(2, Computation.compute(6, 3, "/"));
    }

    @Test
    public void testInvalidOperator() {
        try {
            Computation.compute(2, 3, "%");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }

    @Test
    public void testDivideByZero() {
        try {
            Computation.compute(1, 0, "/");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }

    @Test
    public void testOperandOutOfRange() {
        try {
            Computation.compute(40000, 2, "+");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }
}
