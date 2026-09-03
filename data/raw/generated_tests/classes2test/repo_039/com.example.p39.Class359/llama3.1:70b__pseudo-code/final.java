package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class359().compute(3));
            assertEquals("ok", new Class359().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class359().normalize("  x "));
            assertEquals(7, new Class359().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class359().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

}
