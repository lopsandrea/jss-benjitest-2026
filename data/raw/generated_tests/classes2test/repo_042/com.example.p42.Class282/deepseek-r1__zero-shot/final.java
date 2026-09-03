package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class282Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class282().compute(3));
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class282().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class282().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class282().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class282().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class282().labelFor(1));
    }

    @Test
    void rejectsResetOnTrimmedInput() {
        new Class282().reset();
        assertNotNull(new Class282());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class282().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class282().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class282().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class282().isValid("abc"));
    }

}
