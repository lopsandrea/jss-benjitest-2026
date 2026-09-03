package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class248().compute(3));
            assertEquals("ok", new Class248().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        assertEquals(16, new Class248().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class248().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class248().labelFor(1));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class248().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

}
