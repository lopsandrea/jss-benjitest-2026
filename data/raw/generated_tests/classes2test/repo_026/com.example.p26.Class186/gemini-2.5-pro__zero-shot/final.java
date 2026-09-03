package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class186Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class186().compute(3));
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class186().normalize("  x "));
        assertEquals(7, new Class186().merge(2, 5));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class186().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class186().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class186().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class186().isValid("abc"));
    }

}
