package com.example.webapp;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MessageControllerIT {

    @Test()
    public void testSayHello() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/say/hello"), "hello");
    }

    @Test()
    public void testSayHowAreYou() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/say/how_are_you"), "how are you?");
    }

    @Test()
    public void testSayYes() throws Exception {
        assertEquals(HTTPRequestTestHelper.getResponse("http://localhost:8080/say/yes"), "yes");
    }
}