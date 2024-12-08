package com.example.net;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
class AppTest {
    Task task = new Task();

    @BeforeEach
    void setup ()
    {
        task.setDuration(110);
    }
    @Test
    void testApp() {
        assertEquals("High", task.checkDuration());
    }
}
