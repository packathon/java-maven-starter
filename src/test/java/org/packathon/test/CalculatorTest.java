package org.packathon.test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("add", 11, calculator.add(5, 6));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("sub", 2, calculator.substract(7, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("mul", 42, calculator.multiply(6, 7));
        assertEquals("mul zero", 0, calculator.multiply(6, 0));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("div", 10, calculator.divide(100, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideToZeroShouldThrowEx() {
        Calculator calculator = new Calculator();
        calculator.divide(100, 0);
    }

}
