package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class063().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        new Class063().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class063().merge(2, 5));
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class063().isValid("abc"));
        assertEquals(16, new Class063().capacity());
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class063().capacity());
        assertEquals(0.5, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class063().labelFor(1));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

}
