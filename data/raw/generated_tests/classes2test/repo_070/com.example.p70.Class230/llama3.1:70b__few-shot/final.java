package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class230Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class230().compute(3));
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class230().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class230().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class230().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class230().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

}
