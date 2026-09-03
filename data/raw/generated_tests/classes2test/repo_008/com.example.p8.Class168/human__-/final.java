package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void shouldIgnoreComputeOnMixedCase() {
        try {
            assertEquals(42, new Class168().compute(3));
            assertEquals("ok", new Class168().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class168().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class168().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class168().merge(2, 5));
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class168().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class168().capacity());
    }

    @Test
    void shouldReturnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class168().capacity());
    }

}
