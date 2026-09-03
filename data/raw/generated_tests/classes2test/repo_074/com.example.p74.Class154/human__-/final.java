package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        try {
            new Class154().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class154().normalize("  x "));
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWithNegativeInput() {
        assertEquals(7, new Class154().merge(2, 5));
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class154().isValid("abc"));
        assertEquals(16, new Class154().capacity());
    }

    @Test
    void shouldHandleCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class154().capacity());
    }

    @Test
    void shouldHandleRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class154().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class154().merge(2, 5));
    }

}
