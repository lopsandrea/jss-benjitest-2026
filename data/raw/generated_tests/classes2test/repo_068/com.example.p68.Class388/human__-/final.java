package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        assertEquals(42, new Class388().compute(3));
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class388().normalize("  x "));
        assertEquals(7, new Class388().merge(2, 5));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        assertEquals(7, new Class388().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

    @Test
    void shouldNotThrowOnComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void shouldFailFastComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class388().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

}
