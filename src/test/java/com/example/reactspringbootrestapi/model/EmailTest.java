package com.example.reactspringbootrestapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Email("acccc");
        });
    }

    @Test
    public void testvalidEmail(){
        Email email = new Email("hello@gmail.com");
        assertEquals("hello@gmail.com", email.getAddress());
    }

    @Test
    public void testEqEmail(){
        Email email = new Email("hello@gmail.com");
        Email email2 = new Email("hello@gmail.com");

        assertEquals(email, email2);
    }
}

