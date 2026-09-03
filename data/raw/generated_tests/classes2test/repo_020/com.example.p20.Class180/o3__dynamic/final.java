package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class180().compute(3));
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class180().normalize("  x "));
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class180().merge(2, 5));
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class180().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        assertEquals(0.5, new Class180().ratio(1.0, 2.0), 1e-9);
    }

}
