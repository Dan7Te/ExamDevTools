package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(10, Main.Sum(true, 5, 5));
    }

    @org.junit.jupiter.api.Test
    void MinusSum() {
        assertTrue(35 == Main.Sum(true,15, 20));
    }

    @org.junit.jupiter.api.Test
    void ExceptSum() {
        assertFalse(1 == Main.Sum(true,0, 9));
    }

    @org.junit.jupiter.api.Test
    void ZeroSum() {
        assertEquals(0, Main.Sum(true,0, 0));
    }

    @org.junit.jupiter.api.Test
    void MixSum() {
        assertEquals(-10, Main.Sum(true,-15, 5));
    }
}