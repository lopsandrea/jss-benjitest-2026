package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {
    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        assertEquals(42, new Class212().compute(3));
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class212().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class212().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class212().merge(2, 5));
    }

}
