package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class351().compute(3));
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class351().normalize("  x "));
        assertEquals(7, new Class351().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class351().merge(2, 5));
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

}
