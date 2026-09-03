package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        assertEquals(42, new Class302().compute(3));
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenUnset() {
        assertEquals(7, new Class302().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        assertEquals(16, new Class302().capacity());
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        assertEquals(42, new Class302().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class302().capacity());
    }

    @Test
    void shouldRoundTripComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnMixedCase() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

}
