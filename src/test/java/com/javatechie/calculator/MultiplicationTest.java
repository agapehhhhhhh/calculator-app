package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void testPositiveMultiplication() {
        Multiplication op = new Multiplication();
        int actual = op.calculate(250, 254);
        assertEquals("250 * 254 should equal 63500", 63500, actual);
    }

    @Test
    public void testNegativeMultiplication() {
        Multiplication op = new Multiplication();
        int actual = op.calculate(-125, -323);
        assertEquals("-125 * -323 should equal 40375", 40375, actual);
    }

    @Test
    public void testMultiplicationWithZero() {
        Multiplication op = new Multiplication();
        int actual = op.calculate(223, 0);
        assertEquals("223 * 0 should equal 0", 0, actual);
    }

    @Test
    public void testPositiveAndNegativeMultiplication() {
        Multiplication op = new Multiplication();
        int actual = op.calculate(122, -133);
        assertEquals("122 * -133 should equal -16226", -16226, actual);
    }
}
