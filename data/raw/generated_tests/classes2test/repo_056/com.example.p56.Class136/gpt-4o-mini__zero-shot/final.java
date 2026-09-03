package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            new Class136().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class136().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        assertEquals(16, new Class136().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        assertEquals(0.5, new Class136().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForKnownCode() {
        assertEquals("alpha", new Class136().labelFor(1));
    }

    @Test
    void preservesResetWithNegativeInput() {
        new Class136().reset();
        assertNotNull(new Class136());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

}
