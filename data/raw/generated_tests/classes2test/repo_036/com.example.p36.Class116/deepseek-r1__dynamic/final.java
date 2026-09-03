package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class116Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class116().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class116().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class116().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class116().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class116().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class116().labelFor(1));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class116().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class116().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class116().isValid("abc"));
    }

}
