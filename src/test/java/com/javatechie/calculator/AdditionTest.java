package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void addition_shouldReturnCorrectResult() {
        // (1) setup
        Addition op = new Addition();
        int a = 10, b = 5;
        int expected = 15;

        // (2) exercise
        int actual = op.calculate(a, b);

        // (3) verify
        assertEquals("10 + 5 should equal 15", expected, actual);
    }
}
