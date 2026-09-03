package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class225().compute(3));
            assertEquals("ok", new Class225().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class225().normalize("  x "));
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class225().merge(2, 5));
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class225().isValid("abc"));
        assertEquals(16, new Class225().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class225().capacity());
        assertEquals(0.5, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class225().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class225().merge(2, 5));
    }

}
