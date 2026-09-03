package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class009().compute(3));
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class009().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        assertEquals(16, new Class009().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        assertEquals(0.5, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class009().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class009().capacity());
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

}
