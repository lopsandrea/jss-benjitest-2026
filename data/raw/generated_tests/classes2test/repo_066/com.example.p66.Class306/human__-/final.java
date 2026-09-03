package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void shouldReturnComputeOnMixedCase() {
        assertEquals(42, new Class306().compute(3));
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnRepeatedCall() {
        assertTrue(new Class306().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class306().capacity());
    }

    @Test
    void shouldFailFastCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class306().capacity());
    }

    @Test
    void shouldIgnoreComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class306().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class306().capacity());
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void shouldFailFastNormalizeForBoundaryValue() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class306().merge(2, 5));
    }

    @Test
    void shouldRejectComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

}
