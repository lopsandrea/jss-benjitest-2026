package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class135Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class135().compute(3));
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class135().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class135().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class135().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class135().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnEmptyString() {
        assertEquals("alpha", new Class135().labelFor(1));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class135().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class135().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class135().isValid("abc"));
    }

}
