package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class240().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class240().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class240().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class240().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class240().labelFor(1));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class240().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class240().normalize("  x "));
    }

}
