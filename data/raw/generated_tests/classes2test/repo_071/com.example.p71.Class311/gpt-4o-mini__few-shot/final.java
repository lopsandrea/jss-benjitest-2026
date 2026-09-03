package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class311Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class311().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class311().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class311().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class311().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class311().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class311().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class311().labelFor(1));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class311().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class311().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class311().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class311().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class311().capacity());
    }

}
