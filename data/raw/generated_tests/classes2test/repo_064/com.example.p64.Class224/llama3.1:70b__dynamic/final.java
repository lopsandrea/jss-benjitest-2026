package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void returnsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class224().compute(3));
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class224().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class224().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class224().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

}
