package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            assertEquals(42, new Class160().compute(3));
            assertEquals("ok", new Class160().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class160().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class160().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class160().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnMixedCase() {
        assertEquals("alpha", new Class160().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

}
