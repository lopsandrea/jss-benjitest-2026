package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        try {
            new Class121().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenUnset() {
        new Class121().normalize("  x ");
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class121().merge(2, 5));
        assertTrue(new Class121().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class121().isValid("abc"));
        assertEquals(16, new Class121().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class121().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class121().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class121().labelFor(1));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

}
