package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void subtraction_shouldReturnCorrectResult() {
        Subtraction op = new Subtraction();
        int a = 10, b = 4;
        int expected = 6;

        int actual = op.calculate(a, b);

        assertEquals("10 - 4 should equal 6", expected, actual);
    }
}
