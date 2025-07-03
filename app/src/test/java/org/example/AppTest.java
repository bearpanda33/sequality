package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testGetGreeting() {
        App app = new App();
        // getGreeting()メソッドの返り値が"Hello World!"であることを検証
        assertEquals("Hello World!", app.getGreeting());
    }
}