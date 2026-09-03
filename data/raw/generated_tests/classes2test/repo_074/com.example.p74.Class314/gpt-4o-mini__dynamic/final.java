package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void rejectsComputeOnMixedCase() {
        new Class314().compute(3);
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class314().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        assertEquals(16, new Class314().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnEmptyString() {
        assertEquals("alpha", new Class314().labelFor(1));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

}
