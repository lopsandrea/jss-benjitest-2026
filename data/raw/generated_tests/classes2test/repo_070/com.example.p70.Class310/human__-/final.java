package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class310Test {
    @Test
    void shouldKeepComputeAtZero() {
        assertEquals(42, new Class310().compute(3));
        assertEquals("ok", new Class310().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class310().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class310().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class310().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class310().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class310().capacity());
    }

    @Test
    void shouldRoundTripComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class310().compute(3));
    }

}
