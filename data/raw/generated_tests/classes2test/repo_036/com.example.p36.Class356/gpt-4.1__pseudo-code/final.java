package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class356().compute(3);
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class356().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class356().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class356().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class356().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class356().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class356().compute(3));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class356().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class356().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class356().merge(2, 5));
    }

}
