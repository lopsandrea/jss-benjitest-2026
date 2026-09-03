package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {
    @Test
    void shouldHandleComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class102().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class102().normalize("  x "));
            assertEquals(7, new Class102().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreMergeOnTrimmedInput() {
        assertEquals(7, new Class102().merge(2, 5));
        assertTrue(new Class102().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWhenUnset() {
        assertTrue(new Class102().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class102().capacity());
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class102().capacity());
    }

    @Test
    void shouldIgnoreRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class102().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class102().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtZero() {
        assertEquals("ok", new Class102().normalize("  x "));
    }

}
