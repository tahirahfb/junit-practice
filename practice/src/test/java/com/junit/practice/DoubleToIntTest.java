package com.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test DoubleToInt() method")
public class DoubleToIntTest {
    
    @Test
    void testDoublToInt() {
        assertEquals("112.35", DoubleToInt.newNum());
    }
}
