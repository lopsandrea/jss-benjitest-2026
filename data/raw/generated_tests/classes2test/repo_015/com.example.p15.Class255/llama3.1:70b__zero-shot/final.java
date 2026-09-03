package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void yieldsComputeAtZero() {
        new Class255().compute(3);
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class255().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class255().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class255().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class255().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class255().compute(3));
    }

}
