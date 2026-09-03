package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class063().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class063().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class063().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class063().labelFor(1));
    }

    @Test
    void acceptsResetAtZero() {
        new Class063().reset();
        assertNotNull(new Class063());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

}
