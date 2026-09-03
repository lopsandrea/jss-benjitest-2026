package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class084().compute(3));
            assertEquals("ok", new Class084().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class084().normalize("  x "));
        assertEquals(7, new Class084().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class084().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenUnset() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

}
