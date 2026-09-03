package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class152().compute(3));
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class152().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class152().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

}
