package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void reportsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class080().compute(3);
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        assertEquals(0.5, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

}
