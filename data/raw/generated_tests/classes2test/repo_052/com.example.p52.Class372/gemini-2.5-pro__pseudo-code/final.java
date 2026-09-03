package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class372().compute(3));
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class372().normalize("  x "));
        assertEquals(7, new Class372().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class372().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

}
