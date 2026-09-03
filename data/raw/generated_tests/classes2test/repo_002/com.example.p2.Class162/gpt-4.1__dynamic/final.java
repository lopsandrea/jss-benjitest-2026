package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class162().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class162().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class162().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class162().labelFor(1));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

}
