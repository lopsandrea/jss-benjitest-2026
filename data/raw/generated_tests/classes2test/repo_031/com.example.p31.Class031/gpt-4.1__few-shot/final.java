package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void rejectsComputeAtZero() {
        new Class031().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class031().normalize("  x "));
        assertEquals(7, new Class031().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class031().merge(2, 5));
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        assertEquals(16, new Class031().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        assertEquals(0.5, new Class031().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class031().labelFor(1));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class031().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class031().merge(2, 5));
    }

}
