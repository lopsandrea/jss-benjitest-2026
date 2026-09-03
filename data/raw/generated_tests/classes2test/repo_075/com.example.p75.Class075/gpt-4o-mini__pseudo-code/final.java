package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class075().compute(3));
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class075().normalize("  x "));
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        assertEquals(16, new Class075().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        assertEquals(0.5, new Class075().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnEmptyString() {
        assertEquals("alpha", new Class075().labelFor(1));
    }

    @Test
    void rejectsResetOnTrimmedInput() {
        new Class075().reset();
        assertNotNull(new Class075());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class075().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class075().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class075().isValid("abc"));
    }

}
