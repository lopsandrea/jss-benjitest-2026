package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class354Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class354().compute(3));
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class354().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class354().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class354().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

}
