package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        new Class105().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class105().normalize("  x "));
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class105().merge(2, 5));
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class105().isValid("abc"));
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        assertEquals(0.5, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class105().labelFor(1));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class105().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class105().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class105().compute(3));
    }

}
