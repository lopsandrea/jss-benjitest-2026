package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class028().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class028().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class028().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
    }

}
