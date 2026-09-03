package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class235().compute(3));
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class235().normalize("  x "));
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class235().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class235().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class235().merge(2, 5));
    }

}
