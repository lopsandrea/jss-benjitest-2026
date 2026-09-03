package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {
    @Test
    void shouldHandleComputeWhenUnset() {
        try {
            assertEquals(42, new Class077().compute(3));
            assertEquals("ok", new Class077().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class077().normalize("  x "));
        assertEquals(7, new Class077().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class077().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class077().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class077().capacity());
    }

    @Test
    void shouldReturnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class077().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class077().merge(2, 5));
    }

}
