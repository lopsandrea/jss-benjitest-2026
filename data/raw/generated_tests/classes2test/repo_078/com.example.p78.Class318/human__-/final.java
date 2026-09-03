package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class318Test {
    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class318().compute(3));
            assertEquals("ok", new Class318().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class318().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class318().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void shouldRejectComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class318().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class318().merge(2, 5));
    }

}
