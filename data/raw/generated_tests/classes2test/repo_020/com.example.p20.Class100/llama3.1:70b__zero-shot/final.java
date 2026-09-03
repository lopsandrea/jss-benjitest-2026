package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class100Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        new Class100().compute(3);
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class100().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class100().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class100().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class100().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class100().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnMixedCase() {
        assertEquals("alpha", new Class100().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class100().reset();
        assertNotNull(new Class100());
    }

}
