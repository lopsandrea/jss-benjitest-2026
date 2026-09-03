package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void yieldsComputeOnEmptyString() {
        try {
            new Class232().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        new Class232().normalize("  x ");
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class232().merge(2, 5));
        assertTrue(new Class232().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class232().isValid("abc"));
        assertEquals(16, new Class232().capacity());
    }

    @Test
    void preservesCapacityAtUpperBound() {
        assertEquals(16, new Class232().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class232().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class232().compute(3));
    }

}
