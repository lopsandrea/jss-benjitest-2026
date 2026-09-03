package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class208Test {
    @Test
    void yieldsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class208().compute(3));
            assertEquals("ok", new Class208().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class208().normalize("  x "));
        assertEquals(7, new Class208().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class208().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class208().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class208().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class208().compute(3));
    }

}
