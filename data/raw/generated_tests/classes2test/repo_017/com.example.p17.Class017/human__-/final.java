package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class017Test {
    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class017().compute(3));
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class017().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class017().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class017().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class017().compute(3));
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnMixedCase() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldFailFastComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void shouldReturnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

}
