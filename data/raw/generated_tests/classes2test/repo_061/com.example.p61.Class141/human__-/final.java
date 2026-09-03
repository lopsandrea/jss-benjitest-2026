package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void shouldHandleComputeOnEmptyString() {
        try {
            new Class141().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        new Class141().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        assertEquals(7, new Class141().merge(2, 5));
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnRepeatedCall() {
        assertTrue(new Class141().isValid("abc"));
        assertEquals(16, new Class141().capacity());
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        assertEquals(16, new Class141().capacity());
        assertEquals(42, new Class141().compute(3));
    }

    @Test
    void shouldKeepComputeAtUpperBound() {
        assertEquals(42, new Class141().compute(3));
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeAtUpperBound() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForBoundaryValue() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidAtZero() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

}
