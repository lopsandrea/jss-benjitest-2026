package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class128().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class128().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class128().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class128().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class128().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class128().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class128().isValid("abc"));
    }

}
