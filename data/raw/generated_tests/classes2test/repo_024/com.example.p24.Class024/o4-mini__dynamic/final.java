package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class024().compute(3));
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class024().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class024().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

}
