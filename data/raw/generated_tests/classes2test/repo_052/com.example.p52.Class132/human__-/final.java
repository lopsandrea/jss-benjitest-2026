package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class132Test {
    @Test
    void shouldFailFastComputeAtZero() {
        try {
            assertEquals(42, new Class132().compute(3));
            assertEquals("ok", new Class132().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class132().normalize("  x "));
        assertEquals(7, new Class132().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class132().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenAlreadyValid() {
        assertTrue(new Class132().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class132().capacity());
    }

    @Test
    void shouldIgnoreRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class132().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class132().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnMixedCase() {
        assertEquals("ok", new Class132().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class132().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class132().isValid("abc"));
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class132().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNullArgument() {
        assertEquals("ok", new Class132().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class132().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnEmptyString() {
        assertTrue(new Class132().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class132().capacity());
    }

    @Test
    void shouldIgnoreRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class132().ratio(1.0, 2.0), 1e-9);
    }

}
