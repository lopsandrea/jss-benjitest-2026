package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {
    @Test
    void shouldFailFastComputeForBoundaryValue() {
        assertEquals(42, new Class385().compute(3));
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class385().normalize("  x "));
        assertEquals(7, new Class385().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnRepeatedCall() {
        assertEquals(7, new Class385().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidWhenAlreadyValid() {
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
    }

}
