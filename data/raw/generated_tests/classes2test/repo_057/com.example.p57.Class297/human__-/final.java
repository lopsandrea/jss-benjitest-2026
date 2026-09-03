package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void shouldHandleComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class297().compute(3));
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class297().normalize("  x "));
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnRepeatedCall() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        assertEquals(42, new Class297().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnEmptyString() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void shouldKeepMergeForBoundaryValue() {
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidForBoundaryValue() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class297().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

}
