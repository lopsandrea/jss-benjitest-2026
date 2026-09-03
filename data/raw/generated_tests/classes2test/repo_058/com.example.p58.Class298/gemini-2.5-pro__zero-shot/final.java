package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class298Test {
    @Test
    void acceptsComputeForKnownCode() {
        new Class298().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class298().normalize("  x "));
        assertEquals(7, new Class298().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class298().merge(2, 5));
        assertTrue(new Class298().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class298().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class298().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class298().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class298().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class298().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class298().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class298().isValid("abc"));
    }

}
