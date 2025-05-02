package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void division_shouldReturnCorrectResult() {
        Division op = new Division();
        int a = 20, b = 5;
        int expected = 4;

        int actual = op.calculate(a, b);

        assertEquals("20 / 5 should equal 4", expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZero_shouldThrowArithmeticException() {
        Division op = new Division();
        op.calculate(10, 0); // Expected to throw ArithmeticException
    }
}
