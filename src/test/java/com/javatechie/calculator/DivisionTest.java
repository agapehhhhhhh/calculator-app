package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testPositiveDivision() {
        Division op = new Division();
        int actual = op.calculate(60, 30);
        assertEquals("60 / 30 should equal 2", 2, actual);
    }

    @Test
    public void testNegativeDivision() {
        Division op = new Division();
        int actual = op.calculate(-125, -25);
        assertEquals("-125 / -25 should equal 5", 5, actual);
    }

    @Test
    public void testZeroNumeratorDivision() {
        Division op = new Division();
        int actual = op.calculate(0, 223);
        assertEquals("0 / 223 should equal 0", 0, actual);
    }

    @Test
    public void testPositiveAndNegativeDivision() {
        Division op = new Division();
        int actual = op.calculate(100, -100);
        assertEquals("100 / -100 should equal -1", -1, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero_shouldThrowException() {
        Division op = new Division();
        op.calculate(10, 0); // Will throw ArithmeticException
    }
}
