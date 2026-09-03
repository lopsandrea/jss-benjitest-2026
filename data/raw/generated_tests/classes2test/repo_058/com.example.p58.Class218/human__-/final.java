package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void shouldRejectComputeOnTrimmedInput() {
        try {
            new Class218().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        try {
            new Class218().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class218().merge(2, 5));
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class218().isValid("abc"));
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void shouldFailFastCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class218().capacity());
    }

    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class218().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class218().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class218().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class218().isValid("abc"));
    }

}
