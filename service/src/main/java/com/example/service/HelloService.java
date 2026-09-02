package com.example.service;

import com.example.library.StringService;

public class HelloService {
    public String getGreeting(String firstName, String lastName) {
        return new StringService().formatMessage(firstName, lastName);
    }
}
