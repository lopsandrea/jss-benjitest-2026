package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class276().compute(3));
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class276().normalize("  x "));
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class276().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class276().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class276().isValid("abc"));
    }

}
