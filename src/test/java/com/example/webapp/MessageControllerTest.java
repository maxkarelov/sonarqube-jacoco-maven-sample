package com.example.webapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MessageControllerTest {

    MessageController messageController = new MessageController();

    @Test
    public void testSayHello() {
        assertEquals(messageController.sayHello(), "hello");
    }

    @Test
    public void testSayBye() {
        assertEquals(messageController.sayBye(), "bye");
    }

    @Test
    public void testSaySomething() {
        assertEquals(messageController.saySomething("qwerty"), "qwerty");
    }
}
