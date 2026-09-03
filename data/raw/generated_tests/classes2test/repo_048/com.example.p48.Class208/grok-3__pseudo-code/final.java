package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class208Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class208().compute(3));
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class208().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class208().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        assertEquals(0.5, new Class208().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class208().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class208().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class208().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class208().merge(2, 5));
    }

}
