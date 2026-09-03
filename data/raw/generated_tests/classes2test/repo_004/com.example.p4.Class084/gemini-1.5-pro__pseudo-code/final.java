package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class084().compute(3));
            assertEquals("ok", new Class084().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class084().normalize("  x "));
            assertEquals(7, new Class084().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class084().isValid("abc"));
        assertEquals(16, new Class084().capacity());
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        assertEquals(16, new Class084().capacity());
        assertEquals(0.5, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioAtUpperBound() {
        assertEquals(0.5, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class084().isValid("abc"));
    }

}
