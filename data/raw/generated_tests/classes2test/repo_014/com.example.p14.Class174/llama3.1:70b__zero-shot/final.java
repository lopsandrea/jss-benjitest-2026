package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class174Test {
    @Test
    void returnsComputeForBoundaryValue() {
        new Class174().compute(3);
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        new Class174().normalize("  x ");
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        new Class174().merge(2, 5);
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class174().isValid("abc"));
        assertEquals(16, new Class174().capacity());
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        assertEquals(16, new Class174().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class174().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class174().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class174().compute(3));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class174().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class174().normalize("  x "));
    }

}
