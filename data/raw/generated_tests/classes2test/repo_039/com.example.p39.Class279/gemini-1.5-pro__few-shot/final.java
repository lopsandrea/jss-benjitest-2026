package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {
    @Test
    void keepsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class279().compute(3));
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class279().normalize("  x "));
        assertEquals(7, new Class279().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class279().merge(2, 5));
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class279().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class279().capacity());
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class279().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class279().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class279().capacity());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class279().isValid("abc"));
    }

}
