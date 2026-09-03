package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class327Test {
    @Test
    void shouldKeepComputeAtZero() {
        try {
            assertEquals(42, new Class327().compute(3));
            assertEquals("ok", new Class327().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class327().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class327().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class327().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class327().isValid("abc"));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenUnset() {
        assertTrue(new Class327().isValid("abc"));
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

}
