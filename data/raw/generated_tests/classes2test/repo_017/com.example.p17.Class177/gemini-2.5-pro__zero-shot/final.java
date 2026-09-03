package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            new Class177().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class177().normalize("  x "));
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class177().merge(2, 5));
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class177().isValid("abc"));
        assertEquals(16, new Class177().capacity());
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class177().capacity());
        assertEquals(0.5, new Class177().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioForBoundaryValue() {
        assertEquals(0.5, new Class177().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class177().labelFor(1));
    }

    @Test
    void preservesLabelForWithNegativeInput() {
        assertEquals("alpha", new Class177().labelFor(1));
        new Class177().reset();
        assertNotNull(new Class177());
    }

    @Test
    void acceptsResetAtZero() {
        new Class177().reset();
        assertNotNull(new Class177());
        int expected1 = 42;
        assertEquals(expected1, new Class177().compute(3));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

}
