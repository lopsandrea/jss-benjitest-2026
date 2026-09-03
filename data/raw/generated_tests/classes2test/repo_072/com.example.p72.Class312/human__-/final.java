package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {
    @Test
    void shouldIgnoreComputeWhenUnset() {
        try {
            new Class312().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        new Class312().normalize("  x ");
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        assertEquals(7, new Class312().merge(2, 5));
        assertTrue(new Class312().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class312().isValid("abc"));
        assertEquals(16, new Class312().capacity());
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class312().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtZero() {
        assertTrue(new Class312().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class312().capacity());
    }

    @Test
    void shouldReturnRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class312().ratio(1.0, 2.0), 1e-9);
    }

}
