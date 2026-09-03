package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class385().compute(3));
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class385().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class385().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

}
