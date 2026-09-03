package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class305Test {
    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class305().compute(3));
            assertEquals("ok", new Class305().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class305().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class305().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class305().merge(2, 5));
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidWithNullArgument() {
        assertTrue(new Class305().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class305().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class305().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class305().labelFor(1));
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class305().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        assertEquals("ok", new Class305().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class305().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForBoundaryValue() {
        assertTrue(new Class305().isValid("abc"));
    }

}
