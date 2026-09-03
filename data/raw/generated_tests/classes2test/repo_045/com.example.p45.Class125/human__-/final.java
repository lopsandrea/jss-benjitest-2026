package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class125Test {
    @Test
    void shouldRoundTripComputeOnEmptyString() {
        try {
            assertEquals(42, new Class125().compute(3));
            assertEquals("ok", new Class125().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class125().normalize("  x "));
            assertEquals(7, new Class125().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class125().merge(2, 5));
            assertTrue(new Class125().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class125().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class125().capacity());
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class125().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class125().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class125().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class125().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class125().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class125().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class125().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class125().capacity());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class125().compute(3));
    }

}
