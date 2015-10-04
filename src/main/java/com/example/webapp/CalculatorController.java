package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Calculator API
 *
 * @version 0.1
 */
@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @RequestMapping(value = "/multiply/{a:[0-9]+}/{b:[0-9]+}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return String.valueOf(a * b);
    }

    @RequestMapping(value = "/divide/{a:[0-9]+}/{b:[0-9]+}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        if (b.equals(0)) {
            return "second operand is zero";
        }
        return String.valueOf(a / b);
    }

    @RequestMapping(value = "/add/{a:[0-9]+}/{b:[0-9]+}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return String.valueOf(a + b);
    }

    /** Return result of substraction */
    @RequestMapping(value = "/substract/{a:[0-9]+}/{b:[0-9]+}", method = RequestMethod.GET)
    @ResponseBody
    public String substract(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return String.valueOf(a - b);
    }
}
