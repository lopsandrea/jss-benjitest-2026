package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class137().compute(3));
            assertEquals("ok", new Class137().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class137().normalize("  x "));
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class137().merge(2, 5));
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class137().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class137().capacity());
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class137().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class137().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class137().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class137().labelFor(1));
    }

    @Test
    void returnsLabelForWithNullArgument() {
        assertEquals("alpha", new Class137().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class137().compute(3));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class137().capacity());
    }

}
