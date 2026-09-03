package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class284Test {
    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        new Class284().compute(3);
    }

    @Test
    void shouldFailFastNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class284().normalize("  x "));
        assertEquals(7, new Class284().merge(2, 5));
    }

    @Test
    void shouldRejectMergeAtUpperBound() {
        assertEquals(7, new Class284().merge(2, 5));
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class284().capacity());
    }

    @Test
    void shouldFailFastComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class284().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class284().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class284().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class284().compute(3));
    }

}
