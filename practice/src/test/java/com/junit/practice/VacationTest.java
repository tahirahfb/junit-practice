package com.junit.practice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



@DisplayName ("Test vacation() method")
public class VacationTest {

    @BeforeAll
    static void beforeAll () {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    static void beforeEach () {
        System.out.println("Before each test method");
    }

    @AfterEach
    static void afterEach () {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll () {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("visit test")
    void testVisit() {
        assertEquals("I'd like to visit", Vacation.visit());
    }

    @Test
    @DisplayName("city test")
    void testCity() {
        assertEquals("Dakar", Vacation.visitCity());
    }

    @Test
    @DisplayName("country test")
    void testCountry() {
        assertEquals("Senegal", Vacation.visitCountry());
    }
    
}
