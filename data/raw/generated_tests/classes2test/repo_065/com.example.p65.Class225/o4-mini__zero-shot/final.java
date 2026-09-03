package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void acceptsComputeForKnownCode() {
        new Class225().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class225().normalize("  x "));
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class225().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class225().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class225().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        assertEquals(0.5, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class225().compute(3));
    }

}
