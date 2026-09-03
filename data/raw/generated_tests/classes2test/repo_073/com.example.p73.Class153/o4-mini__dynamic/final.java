package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void returnsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class153().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class153().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class153().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class153().labelFor(1));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class153().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class153().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class153().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class153().capacity());
    }

}
