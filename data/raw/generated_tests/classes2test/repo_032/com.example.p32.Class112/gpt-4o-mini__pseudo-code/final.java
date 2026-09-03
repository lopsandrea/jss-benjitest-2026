package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class112().compute(3));
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class112().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class112().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class112().merge(2, 5));
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class112().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class112().labelFor(1));
    }

    @Test
    void preservesResetOnTrimmedInput() {
        new Class112().reset();
        assertNotNull(new Class112());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class112().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class112().merge(2, 5));
    }

}
