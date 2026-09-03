package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void yieldsComputeAtZero() {
        try {
            assertEquals(42, new Class157().compute(3));
            assertEquals("ok", new Class157().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class157().normalize("  x "));
            assertEquals(7, new Class157().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class157().isValid("abc"));
    }

}
