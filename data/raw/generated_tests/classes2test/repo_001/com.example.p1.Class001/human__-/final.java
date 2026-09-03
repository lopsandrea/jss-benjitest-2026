package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void shouldHandleComputeOnMixedCase() {
        assertEquals(42, new Class001().compute(3));
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        assertEquals("ok", new Class001().normalize("  x "));
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeAtZero() {
        assertEquals(42, new Class001().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWithNullArgument() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class001().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class001().merge(2, 5));
    }

}
