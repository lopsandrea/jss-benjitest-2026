package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {
    @Test
    void clampsComputeAtZero() {
        try {
            new Class366().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class366().normalize("  x "));
            assertEquals(7, new Class366().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class366().merge(2, 5));
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class366().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class366().capacity());
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class366().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class366().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class366().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class366().capacity());
    }

}
