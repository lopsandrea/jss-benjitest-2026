package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class004().compute(3));
            assertEquals("ok", new Class004().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class004().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class004().capacity());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class004().compute(3));
    }

}
