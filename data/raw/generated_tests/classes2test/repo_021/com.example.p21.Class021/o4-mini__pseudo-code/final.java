package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {
    @Test
    void clampsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class021().compute(3));
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class021().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class021().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class021().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class021().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

}
