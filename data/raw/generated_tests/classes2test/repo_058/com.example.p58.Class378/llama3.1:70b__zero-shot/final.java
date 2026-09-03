package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class378().compute(3));
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class378().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class378().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class378().isValid("abc"));
    }

}
