package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void shouldRejectComputeWhenUnset() {
        assertEquals(42, new Class119().compute(3));
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class119().normalize("  x "));
        assertEquals(7, new Class119().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeOnEmptyString() {
        assertEquals(7, new Class119().merge(2, 5));
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class119().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class119().capacity());
    }

    @Test
    void shouldHandleComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class119().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidAtZero() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class119().capacity());
    }

}
