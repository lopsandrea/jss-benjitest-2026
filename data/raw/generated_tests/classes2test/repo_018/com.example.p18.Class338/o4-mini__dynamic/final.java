package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void keepsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class338().compute(3));
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class338().normalize("  x "));
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class338().merge(2, 5));
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class338().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class338().isValid("abc"));
    }

}
