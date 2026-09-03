package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class162().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class162().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class162().capacity());
    }

    @Test
    void keepsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class162().ratio(1.0, 2.0), 1e-9);
    }

}
