package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {
    @Test
    void shouldReturnComputeWithNullArgument() {
        try {
            assertEquals(42, new Class292().compute(3));
            assertEquals("ok", new Class292().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeForBoundaryValue() {
        assertEquals("ok", new Class292().normalize("  x "));
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        assertEquals(16, new Class292().capacity());
    }

    @Test
    void shouldIgnoreRatioWithNullArgument() {
        assertEquals(0.5, new Class292().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForForBoundaryValue() {
        assertEquals("alpha", new Class292().labelFor(1));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class292().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class292().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class292().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class292().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnTrimmedInput() {
        assertTrue(new Class292().isValid("abc"));
    }

}
