package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        Customer customer = new Customer();
        customer.setId(10);

        assertEquals(10, customer.getId());
    }

    @Test
    void setId() {
        Customer customer = new Customer();
        customer.setId(10);

        assertEquals(10, customer.getId());
    }
}