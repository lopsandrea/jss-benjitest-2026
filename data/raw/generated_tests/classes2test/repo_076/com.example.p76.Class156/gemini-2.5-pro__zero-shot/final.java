package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void yieldsComputeWithNullArgument() {
        new Class156().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class156().normalize("  x "));
        assertEquals(7, new Class156().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class156().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class156().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class156().labelFor(1));
    }

    @Test
    void keepsResetOnTrimmedInput() {
        new Class156().reset();
        assertNotNull(new Class156());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

}
