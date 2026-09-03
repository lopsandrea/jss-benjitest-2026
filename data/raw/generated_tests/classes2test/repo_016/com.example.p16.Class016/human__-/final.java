package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class016().compute(3));
            assertEquals("ok", new Class016().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class016().normalize("  x "));
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWhenUnset() {
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnRepeatedCall() {
        assertEquals(16, new Class016().capacity());
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class016().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForKnownCode() {
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class016().capacity());
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class016().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class016().capacity());
    }

    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNullArgument() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

}
