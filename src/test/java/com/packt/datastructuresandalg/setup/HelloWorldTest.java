package com.packt.datastructuresandalg.setup;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assertions.assertEquals("Hello World!", helloWorld.seyHello());
    }
}
