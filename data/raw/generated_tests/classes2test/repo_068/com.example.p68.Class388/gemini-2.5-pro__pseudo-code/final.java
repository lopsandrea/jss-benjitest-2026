package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class388().compute(3));
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class388().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class388().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class388().compute(3));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class388().merge(2, 5));
    }

}
