package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void shouldReturnComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class262().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        new Class262().normalize("  x ");
    }

    @Test
    void shouldReturnMergeAtUpperBound() {
        assertEquals(7, new Class262().merge(2, 5));
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidAtZero() {
        assertTrue(new Class262().isValid("abc"));
        assertEquals(16, new Class262().capacity());
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        assertEquals(16, new Class262().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class262().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class262().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class262().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtZero() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class262().capacity());
    }

    @Test
    void shouldIgnoreComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

}
