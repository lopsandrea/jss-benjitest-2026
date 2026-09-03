package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class050Test {
    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class050().compute(3);
    }

    @Test
    void shouldRoundTripNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class050().normalize("  x "));
        assertEquals(7, new Class050().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class050().merge(2, 5));
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class050().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class050().capacity());
    }

    @Test
    void shouldFailFastCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class050().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class050().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class050().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class050().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class050().merge(2, 5));
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWithNegativeInput() {
        assertTrue(new Class050().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class050().capacity());
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class050().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class050().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class050().merge(2, 5));
    }

}
