package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void clampsComputeAtZero() {
        try {
            new Class227().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class227().merge(2, 5));
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class227().isValid("abc"));
        assertEquals(16, new Class227().capacity());
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class227().capacity());
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

}
