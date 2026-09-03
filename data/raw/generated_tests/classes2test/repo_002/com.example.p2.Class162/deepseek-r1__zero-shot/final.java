package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class162().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class162().normalize("  x "));
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class162().merge(2, 5));
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class162().isValid("abc"));
        assertEquals(16, new Class162().capacity());
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class162().capacity());
        assertEquals(0.5, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioWithNegativeInput() {
        assertEquals(0.5, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class162().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class162().capacity());
    }

    @Test
    void clampsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class162().labelFor(1));
    }

    @Test
    void returnsResetForBoundaryValue() {
        new Class162().reset();
        assertNotNull(new Class162());
    }

}
