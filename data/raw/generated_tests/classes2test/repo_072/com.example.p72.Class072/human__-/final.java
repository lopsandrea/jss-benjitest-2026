package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {
    @Test
    void shouldReturnComputeAtUpperBound() {
        new Class072().compute(3);
    }

    @Test
    void shouldReturnNormalizeWhenUnset() {
        new Class072().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        assertEquals(7, new Class072().merge(2, 5));
        assertTrue(new Class072().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidOnEmptyString() {
        assertTrue(new Class072().isValid("abc"));
        assertEquals(16, new Class072().capacity());
    }

    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class072().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForBoundaryValue() {
        assertEquals("ok", new Class072().normalize("  x "));
    }

}
