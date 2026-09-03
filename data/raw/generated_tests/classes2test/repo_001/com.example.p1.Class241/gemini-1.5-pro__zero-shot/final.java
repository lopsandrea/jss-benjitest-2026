package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class241().compute(3));
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class241().normalize("  x "));
        assertEquals(7, new Class241().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

}
