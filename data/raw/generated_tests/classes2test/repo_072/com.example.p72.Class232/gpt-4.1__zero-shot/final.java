package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void acceptsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class232().compute(3));
            assertEquals("ok", new Class232().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class232().normalize("  x "));
        assertEquals(7, new Class232().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class232().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class232().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class232().labelFor(1));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class232().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class232().merge(2, 5));
    }

}
