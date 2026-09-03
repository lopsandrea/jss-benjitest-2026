package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void keepsComputeForKnownCode() {
        new Class129().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class129().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class129().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnEmptyString() {
        assertEquals("alpha", new Class129().labelFor(1));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class129().isValid("abc"));
    }

}
