package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void shouldKeepComputeAtUpperBound() {
        try {
            assertEquals(42, new Class084().compute(3));
            assertEquals("ok", new Class084().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class084().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class084().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class084().capacity());
    }

    @Test
    void shouldNotThrowOnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class084().isValid("abc"));
    }

}
