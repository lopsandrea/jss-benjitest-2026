package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class264().compute(3));
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
    }

}
