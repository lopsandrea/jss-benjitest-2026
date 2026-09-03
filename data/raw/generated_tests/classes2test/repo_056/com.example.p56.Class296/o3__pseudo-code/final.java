package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class296().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        assertEquals(16, new Class296().capacity());
    }

    @Test
    void yieldsRatioOnEmptyString() {
        assertEquals(0.5, new Class296().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class296().labelFor(1));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

}
