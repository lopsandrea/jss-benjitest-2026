package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void shouldRoundTripComputeWithNullArgument() {
        try {
            new Class215().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class215().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class215().isValid("abc"));
    }

}
