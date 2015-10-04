package com.example.webapp;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController();

    @Test
    public void testMultiply() throws Exception {
        assertEquals(calculatorController.multiply(10, 7), "70");
    }

//    @Test
//    public void testDivide() throws Exception {
//        assertEquals(calculatorController.divide(21, 7), "3");
//    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(calculatorController.add(10, 7), "17");
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(calculatorController.substract(10, 7), "3");
    }
}