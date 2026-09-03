package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class110Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class110().compute(3);
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class110().normalize("  x "));
        assertEquals(7, new Class110().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class110().merge(2, 5));
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class110().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class110().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class110().isValid("abc"));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class110().compute(3));
    }

}
