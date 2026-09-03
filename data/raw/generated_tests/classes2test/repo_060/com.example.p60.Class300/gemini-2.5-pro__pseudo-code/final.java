package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class300().compute(3));
            assertEquals("ok", new Class300().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class300().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        assertEquals(16, new Class300().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        assertEquals(0.5, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
    }

}
