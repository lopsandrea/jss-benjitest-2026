package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void keepsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class056().compute(3));
            assertEquals("ok", new Class056().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class056().normalize("  x "));
            assertEquals(7, new Class056().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class056().merge(2, 5));
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class056().isValid("abc"));
        assertEquals(16, new Class056().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class056().capacity());
        assertEquals(0.5, new Class056().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioForBoundaryValue() {
        assertEquals(0.5, new Class056().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class056().labelFor(1));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class056().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class056().capacity());
    }

}
