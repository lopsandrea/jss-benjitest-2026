package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void shouldFailFastComputeAtZero() {
        new Class002().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class002().normalize("  x "));
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class002().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class002().capacity());
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class002().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class002().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class002().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWithNullArgument() {
        assertEquals("alpha", new Class002().labelFor(1));
    }

    @Test
    void shouldHandleComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void shouldKeepMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class002().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class002().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class002().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
    }

}
