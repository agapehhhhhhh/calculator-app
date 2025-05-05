package com.javatechie.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {

    @Test
    public void testPositiveSubtraction() {
        Subtraction op = new Subtraction();
        int actual = op.calculate(250, 254);
        assertEquals("250 - 254 should equal -4", -4, actual);
    }

    @Test
    public void testNegativeSubtraction() {
        Subtraction op = new Subtraction();
        int actual = op.calculate(-125, -323);
        assertEquals("-125 - (-323) should equal 198", 198, actual);
    }

    @Test
    public void testSubtractionWithZero() {
        Subtraction op = new Subtraction();
        int actual = op.calculate(223, 0);
        assertEquals("223 - 0 should equal 223", 223, actual);
    }

    @Test
    public void testPositiveAndNegativeSubtraction() {
        Subtraction op = new Subtraction();
        int actual = op.calculate(122, -133);
        assertEquals("122 - (-133) should equal 255", 255, actual);
    }
}
