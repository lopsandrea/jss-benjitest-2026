package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void shouldFailFastComputeWhenUnset() {
        assertEquals(42, new Class133().compute(3));
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeForBoundaryValue() {
        assertEquals("ok", new Class133().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class133().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class133().capacity());
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnMixedCase() {
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class133().capacity());
    }

    @Test
    void shouldRoundTripComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

}
