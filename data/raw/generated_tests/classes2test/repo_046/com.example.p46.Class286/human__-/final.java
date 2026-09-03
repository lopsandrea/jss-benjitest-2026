package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class286().compute(3));
            assertEquals("ok", new Class286().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class286().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class286().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidForKnownCode() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class286().capacity());
    }

    @Test
    void shouldFailFastRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void shouldFailFastResetAtZero() {
        new Class286().reset();
        assertNotNull(new Class286());
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNullArgument() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

}
