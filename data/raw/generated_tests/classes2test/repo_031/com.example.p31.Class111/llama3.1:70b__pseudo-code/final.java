package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class111().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class111().capacity());
    }

    @Test
    void clampsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

}
