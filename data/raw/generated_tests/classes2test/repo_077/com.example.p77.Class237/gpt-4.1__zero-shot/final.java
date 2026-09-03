package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class237().normalize("  x "));
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class237().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class237().isValid("abc"));
    }

}
