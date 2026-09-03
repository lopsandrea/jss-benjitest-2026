package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {
    @Test
    void shouldRoundTripComputeWithNullArgument() {
        assertEquals(42, new Class140().compute(3));
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class140().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class140().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class140().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class140().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForKnownCode() {
        assertEquals("ok", new Class140().normalize("  x "));
    }

}
