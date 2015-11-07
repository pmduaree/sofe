package com.sofe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator _calculator;

    @Before
    public void setUp() {
        _calculator = new Calculator();
    }

    @Test
    public void testSum() {

        _calculator.pressNumber(2);
        _calculator.pressSum();
        _calculator.pressNumber(2);
        _calculator.pressEquals();

        assertEquals(4, _calculator.getResult(), 0.001);
    }

    @Test
    public void testMinus() {
        _calculator.pressNumber(2);
        _calculator.pressMinus();
        _calculator.pressNumber(2);
        _calculator.pressEquals();

        assertEquals(0, _calculator.getResult(), 0.001);
    }

    @Test
    public void testMultiply() {
        _calculator.pressNumber(2);
        _calculator.pressMultiply();
        _calculator.pressNumber(3);
        _calculator.pressMultiply();
        _calculator.pressNumber(3);
        _calculator.pressMultiply();
        _calculator.pressNumber(3);
        _calculator.pressMultiply();
        _calculator.pressNumber(3);
        _calculator.pressEquals();
        assertEquals(162, _calculator.getResult(), 0.001);
    }

    @Test
    public void testDivide() {
        _calculator.pressNumber(3);
        _calculator.pressDivide();
        _calculator.pressNumber(3);
        _calculator.pressEquals();
        assertEquals(1, _calculator.getResult(), 0.001);
    }
}