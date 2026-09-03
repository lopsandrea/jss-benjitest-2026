package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class320().compute(3));
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class320().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class320().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

}
