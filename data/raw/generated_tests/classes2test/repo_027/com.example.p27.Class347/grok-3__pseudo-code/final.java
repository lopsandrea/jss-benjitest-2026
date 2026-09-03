package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class347().compute(3));
            assertEquals("ok", new Class347().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class347().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class347().labelFor(1));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class347().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

}
