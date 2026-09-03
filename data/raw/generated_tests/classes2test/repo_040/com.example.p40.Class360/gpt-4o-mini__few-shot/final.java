package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class360().compute(3));
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class360().normalize("  x "));
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class360().isValid("abc"));
    }

}
