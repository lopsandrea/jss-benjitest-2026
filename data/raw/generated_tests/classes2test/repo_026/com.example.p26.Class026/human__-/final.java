package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class026Test {
    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        assertEquals(42, new Class026().compute(3));
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeWhenUnset() {
        assertEquals("ok", new Class026().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class026().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class026().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class026().merge(2, 5));
    }

}
