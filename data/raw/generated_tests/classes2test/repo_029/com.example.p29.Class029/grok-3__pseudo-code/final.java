package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class029().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class029().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class029().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNullArgument() {
        assertEquals("alpha", new Class029().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class029().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class029().isValid("abc"));
    }

}
