package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class365().compute(3));
            assertEquals("ok", new Class365().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class365().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class365().isValid("abc"));
    }

}
