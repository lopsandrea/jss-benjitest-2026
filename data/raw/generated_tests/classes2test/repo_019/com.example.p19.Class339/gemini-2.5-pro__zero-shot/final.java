package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            new Class339().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class339().normalize("  x "));
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class339().merge(2, 5));
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        assertEquals(16, new Class339().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class339().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

}
