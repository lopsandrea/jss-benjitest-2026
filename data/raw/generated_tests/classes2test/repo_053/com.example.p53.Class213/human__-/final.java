package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void shouldReturnComputeWithNegativeInput() {
        assertEquals(42, new Class213().compute(3));
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeAtUpperBound() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

    @Test
    void shouldFailFastRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenUnset() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenUnset() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenUnset() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class213().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class213().capacity());
    }

    @Test
    void shouldFailFastComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class213().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

}
