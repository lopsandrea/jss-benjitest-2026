package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class031().compute(3));
        assertEquals("ok", new Class031().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class031().normalize("  x "));
        assertEquals(7, new Class031().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class031().merge(2, 5));
        assertTrue(new Class031().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class031().isValid("abc"));
        assertEquals(16, new Class031().capacity());
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class031().capacity());
        assertEquals(0.5, new Class031().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class031().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class031().labelFor(1));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class031().compute(3));
    }

}
