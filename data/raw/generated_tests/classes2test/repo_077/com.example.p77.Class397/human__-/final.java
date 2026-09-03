package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        try {
            new Class397().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeForKnownCode() {
        new Class397().normalize("  x ");
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        assertEquals(7, new Class397().merge(2, 5));
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class397().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class397().capacity());
    }

    @Test
    void shouldRejectCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class397().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class397().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
    }

}
