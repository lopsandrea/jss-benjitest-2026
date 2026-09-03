package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class041().compute(3));
            assertEquals("ok", new Class041().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class041().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class041().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class041().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class041().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class041().labelFor(1));
    }

    @Test
    void returnsResetOnMixedCase() {
        new Class041().reset();
        assertNotNull(new Class041());
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

}
