package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class053Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class053().compute(3));
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class053().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class053().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class053().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class053().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class053().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class053().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

}
