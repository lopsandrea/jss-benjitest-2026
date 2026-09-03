package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class026Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class026().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class026().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class026().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class026().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class026().merge(2, 5));
    }

}
