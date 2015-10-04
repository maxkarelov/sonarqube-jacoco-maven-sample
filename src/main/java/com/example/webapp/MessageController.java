package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Message
 *
 * @version 0.1
 */
@Controller
@RequestMapping("/say")
public class MessageController {

    @ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
        return "hello";
	}

    @ResponseBody
    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String sayBye() {
        return "bye";
    }

    @ResponseBody
    @RequestMapping(value = "/how_are_you", method = RequestMethod.GET)
    public String sayHowAreYou() {
        return "how are you?";
    }

    @ResponseBody
    @RequestMapping(value = "/{something}", method = RequestMethod.GET)
    public String saySomething(@PathVariable("something") String something) {;

        if (something.equals("yes")) {
            System.out.println("you said \"yes\"");
        } else {
            System.out.println("you said " + something);
        }

        return something;
    }
}