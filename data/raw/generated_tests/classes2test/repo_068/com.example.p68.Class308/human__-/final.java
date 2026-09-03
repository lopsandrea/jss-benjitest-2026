package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        try {
            assertEquals(42, new Class308().compute(3));
            assertEquals("ok", new Class308().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class308().normalize("  x "));
        assertEquals(7, new Class308().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWithNullArgument() {
        assertEquals(7, new Class308().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class308().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWithNegativeInput() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void shouldFailFastResetOnMixedCase() {
        new Class308().reset();
        assertNotNull(new Class308());
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class308().merge(2, 5));
    }

    @Test
    void shouldIgnoreComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class308().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidAtUpperBound() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class308().capacity());
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectLabelForForBoundaryValue() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

}
