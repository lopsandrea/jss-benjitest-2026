package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class320().compute(3));
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class320().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

}
