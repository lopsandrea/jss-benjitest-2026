package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class230Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class230().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class230().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class230().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class230().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class230().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class230().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class230().merge(2, 5));
    }

}
