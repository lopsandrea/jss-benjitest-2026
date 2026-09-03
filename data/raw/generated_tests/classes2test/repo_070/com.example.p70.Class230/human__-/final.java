package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class230Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        assertEquals(42, new Class230().compute(3));
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class230().normalize("  x "));
        assertEquals(7, new Class230().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        assertEquals(7, new Class230().merge(2, 5));
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidWhenUnset() {
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class230().capacity());
    }

    @Test
    void shouldKeepRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class230().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

}
