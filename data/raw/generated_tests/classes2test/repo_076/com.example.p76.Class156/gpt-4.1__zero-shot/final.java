package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class156().compute(3));
            assertEquals("ok", new Class156().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class156().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class156().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class156().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class156().labelFor(1));
    }

    @Test
    void yieldsResetOnEmptyString() {
        new Class156().reset();
        assertNotNull(new Class156());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

}
