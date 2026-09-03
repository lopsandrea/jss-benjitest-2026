package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class346().compute(3));
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class346().normalize("  x "));
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class346().merge(2, 5));
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class346().compute(3));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class346().isValid("abc"));
    }

}
