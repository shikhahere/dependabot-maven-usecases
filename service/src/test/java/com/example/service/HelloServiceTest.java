package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {
    @Test
    void getGreetingReturnsFormattedGreeting() {
        HelloService service = new HelloService();
        assertEquals("Hello - Jane Doe", service.getGreeting(" Jane ", "Doe"));
    }
}
