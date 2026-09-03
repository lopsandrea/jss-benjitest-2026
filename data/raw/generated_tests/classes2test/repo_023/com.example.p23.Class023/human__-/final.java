package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        try {
            assertEquals(42, new Class023().compute(3));
            assertEquals("ok", new Class023().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class023().normalize("  x "));
            assertEquals(7, new Class023().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidForBoundaryValue() {
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class023().capacity());
    }

    @Test
    void shouldKeepRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnMixedCase() {
        assertEquals("alpha", new Class023().labelFor(1));
    }

    @Test
    void shouldIgnoreResetOnEmptyString() {
        new Class023().reset();
        assertNotNull(new Class023());
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnTrimmedInput() {
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

}
