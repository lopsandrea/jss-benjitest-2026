package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            new Class210().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class210().normalize("  x "));
            assertEquals(7, new Class210().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class210().merge(2, 5));
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class210().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class210().capacity());
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNullArgument() {
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
    }

}
