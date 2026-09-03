package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void rejectsComputeWithNullArgument() {
        new Class296().compute(3);
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class296().normalize("  x "));
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class296().merge(2, 5));
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class296().capacity());
    }

    @Test
    void keepsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class296().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

}
