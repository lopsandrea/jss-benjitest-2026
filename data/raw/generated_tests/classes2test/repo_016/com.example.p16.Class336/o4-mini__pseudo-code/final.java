package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class336().compute(3));
            assertEquals("ok", new Class336().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class336().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class336().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class336().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class336().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class336().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class336().compute(3));
    }

}
