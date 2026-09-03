package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class233Test {
    @Test
    void shouldRejectComputeOnTrimmedInput() {
        assertEquals(42, new Class233().compute(3));
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class233().normalize("  x "));
        assertEquals(7, new Class233().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
        assertTrue(new Class233().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class233().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class233().capacity());
    }

    @Test
    void shouldKeepCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class233().capacity());
    }

    @Test
    void shouldReturnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class233().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class233().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnMixedCase() {
        assertTrue(new Class233().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

}
