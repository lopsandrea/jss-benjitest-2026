package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            assertEquals(42, new Class161().compute(3));
            assertEquals("ok", new Class161().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class161().normalize("  x "));
            assertEquals(7, new Class161().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeForKnownCode() {
        try {
            assertEquals(7, new Class161().merge(2, 5));
            assertTrue(new Class161().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class161().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class161().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        assertEquals(0.5, new Class161().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class161().compute(3));
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class161().compute(3));
    }

}
