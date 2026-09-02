package com.example.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringServiceTest {
    @Test
    void formatMessageIncludesName() {
        StringService service = new StringService();
        assertEquals("Hello - Jane Doe", service.formatMessage(" Jane ", "Doe"));
    }
}
