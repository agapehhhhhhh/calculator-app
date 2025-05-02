package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void multiplication_shouldReturnCorrectResult() {
        Multiplication op = new Multiplication();
        int a = 4, b = 5;
        int expected = 20;

        int actual = op.calculate(a, b);

        assertEquals("4 * 5 should equal 20", expected, actual);
    }
}
