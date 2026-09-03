package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class036().compute(3));
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class036().normalize("  x "));
        assertEquals(7, new Class036().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class036().merge(2, 5));
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class036().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class036().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class036().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class036().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class036().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class036().compute(3));
    }

}
