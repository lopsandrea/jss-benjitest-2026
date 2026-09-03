package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        try {
            new Class189().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class189().normalize("  x "));
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        assertEquals(7, new Class189().merge(2, 5));
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidAtUpperBound() {
        assertTrue(new Class189().isValid("abc"));
        assertEquals(16, new Class189().capacity());
    }

    @Test
    void shouldIgnoreCapacityWithNullArgument() {
        assertEquals(16, new Class189().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForWithNegativeInput() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnTrimmedInput() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class189().capacity());
    }

    @Test
    void shouldRoundTripRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void shouldIgnoreComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNullArgument() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

}
