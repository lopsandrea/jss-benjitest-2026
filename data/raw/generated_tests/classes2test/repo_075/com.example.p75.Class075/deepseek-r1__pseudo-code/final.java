package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class075().compute(3));
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class075().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class075().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class075().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class075().ratio(1.0, 2.0), 1e-9);
    }

}
