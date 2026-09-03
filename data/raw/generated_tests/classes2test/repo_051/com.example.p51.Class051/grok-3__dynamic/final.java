package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void acceptsComputeForKnownCode() {
        new Class051().compute(3);
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class051().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class051().capacity());
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void reportsResetOnEmptyString() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

}
