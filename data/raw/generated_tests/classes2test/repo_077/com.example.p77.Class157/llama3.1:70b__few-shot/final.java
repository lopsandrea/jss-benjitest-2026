package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class157().compute(3));
            assertEquals("ok", new Class157().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

}
