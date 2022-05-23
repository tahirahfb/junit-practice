package com.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test StringToInt() method")
public class StringToIntTest {
    
    @Test
    void testStringToInt() {
        assertEquals("49", StringToInt.newNum());
    }
}
