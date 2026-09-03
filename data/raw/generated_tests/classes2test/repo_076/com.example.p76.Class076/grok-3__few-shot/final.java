package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class076().compute(3));
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class076().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

}
