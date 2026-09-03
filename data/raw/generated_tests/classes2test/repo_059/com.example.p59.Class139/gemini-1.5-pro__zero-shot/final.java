package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class139Test {
    @Test
    void returnsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class139().compute(3));
            assertEquals("ok", new Class139().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class139().normalize("  x "));
        assertEquals(7, new Class139().merge(2, 5));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class139().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class139().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class139().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class139().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class139().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class139().labelFor(1));
    }

}
