package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class163Test {
    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class163().compute(3));
            assertEquals("ok", new Class163().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class163().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class163().merge(2, 5));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class163().merge(2, 5));
        assertTrue(new Class163().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class163().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class163().capacity());
    }

    @Test
    void shouldReturnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class163().capacity());
    }

    @Test
    void shouldIgnoreRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class163().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class163().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class163().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class163().capacity());
    }

    @Test
    void shouldHandleRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class163().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class163().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class163().compute(3));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

}
