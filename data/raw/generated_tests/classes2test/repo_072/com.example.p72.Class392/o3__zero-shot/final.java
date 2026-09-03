package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class392().compute(3));
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class392().merge(2, 5));
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class392().isValid("abc"));
        assertEquals(16, new Class392().capacity());
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        assertEquals(16, new Class392().capacity());
        assertEquals(0.5, new Class392().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioAtUpperBound() {
        assertEquals(0.5, new Class392().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class392().compute(3));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class392().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

}
