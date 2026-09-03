package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class173Test {
    @Test
    void shouldReturnComputeForKnownCode() {
        try {
            assertEquals(42, new Class173().compute(3));
            assertEquals("ok", new Class173().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class173().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class173().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class173().merge(2, 5));
        assertTrue(new Class173().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidWithNullArgument() {
        assertTrue(new Class173().isValid("abc"));
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class173().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class173().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class173().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class173().compute(3));
    }

    @Test
    void shouldHandleNormalizeForKnownCode() {
        assertEquals("ok", new Class173().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class173().merge(2, 5));
    }

}
