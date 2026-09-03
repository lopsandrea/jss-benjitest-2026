package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class278().compute(3);
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class278().normalize("  x "));
        assertEquals(7, new Class278().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class278().merge(2, 5));
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class278().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

}
