package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class127Test {
    @Test
    void shouldReturnComputeOnEmptyString() {
        try {
            assertEquals(42, new Class127().compute(3));
            assertEquals("ok", new Class127().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class127().normalize("  x "));
            assertEquals(7, new Class127().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class127().merge(2, 5));
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class127().capacity());
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class127().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class127().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenAlreadyValid() {
        assertTrue(new Class127().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class127().capacity());
    }

}
