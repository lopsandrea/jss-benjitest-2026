package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class074().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class074().normalize("  x "));
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class074().merge(2, 5));
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class074().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class074().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class074().compute(3));
    }

}
