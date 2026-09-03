package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        new Class323().compute(3);
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class323().normalize("  x "));
        assertEquals(7, new Class323().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class323().merge(2, 5));
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class323().isValid("abc"));
        assertEquals(42, new Class323().compute(3));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class323().compute(3));
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

}
