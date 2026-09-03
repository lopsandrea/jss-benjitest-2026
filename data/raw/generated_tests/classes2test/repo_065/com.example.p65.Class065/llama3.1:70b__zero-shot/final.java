package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {
    @Test
    void clampsComputeOnEmptyString() {
        new Class065().compute(3);
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class065().normalize("  x "));
        assertEquals(7, new Class065().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class065().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class065().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

}
