package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class266().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class266().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class266().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class266().labelFor(1));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

}
