package org.example;

import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    public void testGreeter() {
        Greeter greeter = new Greeter();
        assert greeter.getGreeting().toLowerCase().contains("hello");
        assert greeter.getGreeting().toLowerCase().contains("world");
    }

}
