package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class029().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class029().merge(2, 5));
    }

}
