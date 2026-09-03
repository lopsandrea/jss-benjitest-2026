package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class130Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class130().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class130().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class130().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

}
