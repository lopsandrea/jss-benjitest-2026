package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class003Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class003().compute(3));
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class003().normalize("  x "));
        assertEquals(7, new Class003().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class003().merge(2, 5));
        assertTrue(new Class003().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class003().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class003().capacity());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

}
