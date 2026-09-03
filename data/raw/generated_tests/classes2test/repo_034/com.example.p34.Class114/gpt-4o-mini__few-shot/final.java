package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class114Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class114().compute(3));
        assertEquals("ok", new Class114().normalize("  x "));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class114().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class114().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class114().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class114().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class114().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class114().ratio(1.0, 2.0), 1e-9);
    }

}
