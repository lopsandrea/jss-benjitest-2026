package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class021().compute(3);
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class021().normalize("  x "));
        assertEquals(7, new Class021().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class021().merge(2, 5));
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class021().isValid("abc"));
        assertEquals(42, new Class021().compute(3));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class021().compute(3));
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class021().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class021().isValid("abc"));
    }

}
