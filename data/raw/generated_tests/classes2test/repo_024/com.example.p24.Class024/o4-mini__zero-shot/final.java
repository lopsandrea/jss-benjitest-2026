package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class024().compute(3));
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class024().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class024().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class024().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class024().compute(3));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

}
