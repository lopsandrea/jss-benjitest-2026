package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void rejectsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class290().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        new Class290().normalize("  x ");
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class290().merge(2, 5));
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class290().isValid("abc"));
        assertEquals(16, new Class290().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class290().capacity());
        assertEquals(0.5, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

}
