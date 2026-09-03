package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void shouldRejectComputeForKnownCode() {
        new Class047().compute(3);
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class047().normalize("  x "));
        assertEquals(7, new Class047().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        assertEquals(7, new Class047().merge(2, 5));
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidForKnownCode() {
        assertTrue(new Class047().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class047().capacity());
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class047().compute(3));
    }

    @Test
    void shouldHandleNormalizeAtZero() {
        assertEquals("ok", new Class047().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class047().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnTrimmedInput() {
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class047().capacity());
    }

}
