package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            new Class099().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class099().normalize("  x "));
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class099().merge(2, 5));
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class099().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class099().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class099().labelFor(1));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

}
