package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class337Test {
    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class337().compute(3));
            assertEquals("ok", new Class337().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class337().normalize("  x "));
        assertEquals(7, new Class337().merge(2, 5));
    }

    @Test
    void shouldReturnMergeAtUpperBound() {
        assertEquals(7, new Class337().merge(2, 5));
        assertTrue(new Class337().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class337().isValid("abc"));
        assertEquals(16, new Class337().capacity());
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        assertEquals(16, new Class337().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class337().compute(3));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

}
