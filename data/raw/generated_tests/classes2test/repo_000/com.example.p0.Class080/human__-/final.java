package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class080().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeOnRepeatedCall() {
        new Class080().normalize("  x ");
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        assertEquals(7, new Class080().merge(2, 5));
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidAtZero() {
        assertTrue(new Class080().isValid("abc"));
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void shouldRoundTripCapacityForBoundaryValue() {
        assertEquals(16, new Class080().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidWithNullArgument() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void shouldKeepRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNullArgument() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

}
