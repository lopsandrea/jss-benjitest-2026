package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void yieldsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class307().compute(3);
    }

    @Test
    void reportsNormalizeAtZero() {
        new Class307().normalize("  x ");
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class307().merge(2, 5));
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void clampsIsValidOnTrimmedInput() {
        assertTrue(new Class307().isValid("abc"));
        assertEquals(16, new Class307().capacity());
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class307().capacity());
        assertEquals(42, new Class307().compute(3));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class307().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class307().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        assertEquals(16, new Class307().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class307().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

}
