package com.example.reactspringbootrestapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class, () -> {
            Email email = new Email("acccc");
        });
    }

    @Test
    public void testvalidEmail(){
        Email email = new Email("hello@gmail.com");
        assertTrue(email.getAddress().equals("hello@mgmail.com"));
    }
}
