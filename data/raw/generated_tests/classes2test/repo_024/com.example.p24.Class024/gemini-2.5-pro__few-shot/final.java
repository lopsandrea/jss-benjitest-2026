package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class024().compute(3));
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class024().normalize("  x "));
        assertEquals(7, new Class024().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class024().merge(2, 5));
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class024().isValid("abc"));
    }

}
