package com.example.webapp;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CalculatorControllerIT {

    @Test
    public void testMultiply() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/calc/multiply/13/3"), "39");
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/calc/divide/33/3"), "11");
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/calc/add/13/3"), "16");
    }

    @Test
    public void testSubstract() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/calc/substract/13/3"), "10");
    }
}