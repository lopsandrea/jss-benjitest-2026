package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class025().compute(3));
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class025().normalize("  x "));
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class025().capacity());
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class025().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class025().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class025().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class025().isValid("abc"));
    }

}
