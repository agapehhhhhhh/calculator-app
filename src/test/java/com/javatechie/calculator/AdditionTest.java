package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testPositiveAddition() {
        Addition op = new Addition();
        int actual = op.calculate(250, 254);
        assertEquals("250 + 254 should equal 504", 504, actual);
    }

    @Test
    public void testNegativeAddition() {
        Addition op = new Addition();
        int actual = op.calculate(-125, -323);
        assertEquals("-125 + (-323) should equal -448", -448, actual);
    }

    @Test
    public void testAdditionWithZero() {
        Addition op = new Addition();
        int actual = op.calculate(223, 0);
        assertEquals("223 + 0 should equal 223", 223, actual);
    }

    @Test
    public void testPositiveAndNegativeAddition() {
        Addition op = new Addition();
        int actual = op.calculate(122, -133);
        assertEquals("122 + (-133) should equal -11", -11, actual);
    }
}
