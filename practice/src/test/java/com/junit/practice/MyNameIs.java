package com.junit.practice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("MyNameIs Test")
public class MyNameIs {

    @BeforeAll
    static void beforeAll ()    {
        System.out.println("Before all test methods");
    }

    @Test
    @DisplayName("MyNameIs")
    void testMyNameIs () {
        assertEquals("My name is Tahirah Farrer-Bradley", MyNameIs.myName());
    }

    
}
