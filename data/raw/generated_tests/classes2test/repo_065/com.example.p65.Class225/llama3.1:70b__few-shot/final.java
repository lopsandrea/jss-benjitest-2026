package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class225().compute(3));
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class225().normalize("  x "));
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class225().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class225().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class225().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

}
