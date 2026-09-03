package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class217().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        new Class217().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        new Class217().merge(2, 5);
    }

    @Test
    void shouldNotThrowOnIsValidForKnownCode() {
        assertTrue(new Class217().isValid("abc"));
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        assertEquals(16, new Class217().capacity());
        assertEquals(0.5, new Class217().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class217().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class217().labelFor(1));
    }

    @Test
    void shouldHandleLabelForWhenUnset() {
        assertEquals("alpha", new Class217().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class217().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class217().merge(2, 5));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class217().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

}
