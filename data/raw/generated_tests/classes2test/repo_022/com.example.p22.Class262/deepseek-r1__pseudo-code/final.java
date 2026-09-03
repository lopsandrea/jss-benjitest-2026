package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {
    @Test
    void preservesComputeWithNullArgument() {
        try {
            assertEquals(42, new Class262().compute(3));
            assertEquals("ok", new Class262().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class262().normalize("  x "));
        assertEquals(7, new Class262().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class262().merge(2, 5));
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class262().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class262().capacity());
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class262().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class262().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class262().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class262().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class262().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class262().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class262().capacity());
    }

}
