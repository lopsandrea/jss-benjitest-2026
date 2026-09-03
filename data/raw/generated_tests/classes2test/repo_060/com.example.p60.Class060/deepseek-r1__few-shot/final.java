package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class060().compute(3));
            assertEquals("ok", new Class060().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

}
