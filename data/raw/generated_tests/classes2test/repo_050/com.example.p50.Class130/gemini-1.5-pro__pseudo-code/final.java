package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class130Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class130().compute(3));
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class130().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class130().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class130().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class130().compute(3));
    }

}
