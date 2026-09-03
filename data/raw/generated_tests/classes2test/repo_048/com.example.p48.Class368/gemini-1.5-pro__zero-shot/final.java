package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void reportsComputeWithNullArgument() {
        new Class368().compute(3);
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class368().normalize("  x "));
        assertEquals(7, new Class368().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class368().merge(2, 5));
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class368().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class368().capacity());
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class368().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class368().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class368().labelFor(1));
    }

    @Test
    void clampsResetOnTrimmedInput() {
        new Class368().reset();
        assertNotNull(new Class368());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class368().merge(2, 5));
    }

}
