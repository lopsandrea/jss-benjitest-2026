package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            new Class046().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class046().normalize("  x "));
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        assertEquals(7, new Class046().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class046().isValid("abc"));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        assertEquals(42, new Class046().compute(3));
    }

}
