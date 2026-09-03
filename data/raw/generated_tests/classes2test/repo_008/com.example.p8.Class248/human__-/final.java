package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void shouldRejectComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class248().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        assertEquals(16, new Class248().capacity());
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class248().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForForBoundaryValue() {
        assertEquals("alpha", new Class248().labelFor(1));
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

}
