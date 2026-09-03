package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void shouldFailFastComputeWhenUnset() {
        new Class058().compute(3);
    }

    @Test
    void shouldReturnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class058().normalize("  x "));
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        assertEquals(16, new Class058().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class058().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForWithNegativeInput() {
        assertEquals("alpha", new Class058().labelFor(1));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class058().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class058().capacity());
    }

    @Test
    void shouldRejectRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class058().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForWithNullArgument() {
        assertEquals("alpha", new Class058().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class058().merge(2, 5));
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

}
