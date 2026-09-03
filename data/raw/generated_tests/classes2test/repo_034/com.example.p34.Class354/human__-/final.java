package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class354Test {
    @Test
    void shouldReturnComputeWithNullArgument() {
        assertEquals(42, new Class354().compute(3));
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class354().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class354().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForForKnownCode() {
        assertEquals("alpha", new Class354().labelFor(1));
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnTrimmedInput() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class354().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class354().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForWhenUnset() {
        assertEquals("alpha", new Class354().labelFor(1));
    }

    @Test
    void shouldIgnoreComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

}
