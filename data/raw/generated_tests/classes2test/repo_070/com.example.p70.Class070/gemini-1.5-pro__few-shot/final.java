package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class070().compute(3));
            assertEquals("ok", new Class070().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class070().normalize("  x "));
        assertEquals(7, new Class070().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class070().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class070().capacity());
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class070().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class070().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class070().compute(3));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

}
