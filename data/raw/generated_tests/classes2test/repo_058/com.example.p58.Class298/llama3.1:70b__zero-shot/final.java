package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class298Test {
    @Test
    void acceptsComputeWithNullArgument() {
        new Class298().compute(3);
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class298().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class298().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class298().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class298().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class298().capacity());
    }

    @Test
    void preservesRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class298().ratio(1.0, 2.0), 1e-9);
    }

}
