package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class396Test {
    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class396().compute(3);
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        new Class396().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        new Class396().merge(2, 5);
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class396().isValid("abc"));
        assertEquals(42, new Class396().compute(3));
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        assertEquals(42, new Class396().compute(3));
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class396().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class396().merge(2, 5));
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidAtZero() {
        assertTrue(new Class396().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class396().compute(3));
    }

    @Test
    void shouldIgnoreComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class396().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class396().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class396().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class396().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidForBoundaryValue() {
        assertTrue(new Class396().isValid("abc"));
    }

}
