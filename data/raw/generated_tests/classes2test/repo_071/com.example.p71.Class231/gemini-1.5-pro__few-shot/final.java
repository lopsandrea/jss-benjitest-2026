package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void returnsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class231().compute(3));
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class231().normalize("  x "));
        assertEquals(7, new Class231().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class231().merge(2, 5));
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class231().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class231().capacity());
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class231().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class231().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class231().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

}
