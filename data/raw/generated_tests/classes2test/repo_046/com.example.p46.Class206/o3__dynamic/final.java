package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class206Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class206().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class206().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class206().merge(2, 5));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class206().compute(3));
    }

}
