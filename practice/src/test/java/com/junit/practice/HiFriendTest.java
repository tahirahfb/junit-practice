package com.junit.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class HiFriendTest {
    /**
     * Rigorous Test.
     */
    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        assertEquals("Hi Larry Sprinkle!", HiFriend.hiFriend("Larry Sprinkle"));
    }

}
