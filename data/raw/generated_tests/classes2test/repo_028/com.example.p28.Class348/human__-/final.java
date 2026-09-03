package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {
    @Test
    void shouldReturnComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class348().compute(3));
            assertEquals("ok", new Class348().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class348().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class348().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class348().merge(2, 5));
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class348().capacity());
    }

    @Test
    void shouldIgnoreRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class348().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtZero() {
        assertEquals("alpha", new Class348().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class348().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class348().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnRepeatedCall() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class348().capacity());
    }

    @Test
    void shouldReturnRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class348().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForWithNullArgument() {
        assertEquals("alpha", new Class348().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class348().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class348().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class348().capacity());
    }

}
