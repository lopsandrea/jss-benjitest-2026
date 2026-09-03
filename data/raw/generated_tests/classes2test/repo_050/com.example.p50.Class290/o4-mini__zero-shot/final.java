package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class290().compute(3));
            assertEquals("ok", new Class290().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class290().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class290().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class290().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class290().capacity());
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class290().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class290().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class290().labelFor(1));
    }

    @Test
    void acceptsLabelForAtUpperBound() {
        assertEquals("alpha", new Class290().labelFor(1));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class290().isValid("abc"));
    }

}
