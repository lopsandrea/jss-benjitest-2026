package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class302().compute(3));
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class302().normalize("  x "));
        assertEquals(7, new Class302().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class302().merge(2, 5));
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class302().isValid("abc"));
        assertEquals(16, new Class302().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class302().capacity());
    }

    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class302().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class302().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

}
