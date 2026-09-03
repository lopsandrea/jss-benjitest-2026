package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class349Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class349().compute(3));
            assertEquals("ok", new Class349().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class349().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class349().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class349().merge(2, 5));
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidOnTrimmedInput() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class349().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void shouldReturnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class349().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class349().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class349().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class349().capacity());
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class349().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

}
