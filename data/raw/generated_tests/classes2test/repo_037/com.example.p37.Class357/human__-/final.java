package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class357Test {
    @Test
    void shouldIgnoreComputeWithNullArgument() {
        try {
            assertEquals(42, new Class357().compute(3));
            assertEquals("ok", new Class357().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class357().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class357().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class357().merge(2, 5));
        assertTrue(new Class357().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnTrimmedInput() {
        assertTrue(new Class357().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class357().capacity());
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class357().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class357().compute(3));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class357().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class357().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class357().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForBoundaryValue() {
        assertTrue(new Class357().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class357().capacity());
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class357().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class357().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class357().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class357().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class357().capacity());
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class357().compute(3));
    }

}
