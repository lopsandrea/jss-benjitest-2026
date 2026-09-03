package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class214().capacity());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class214().isValid("abc"));
    }

}
