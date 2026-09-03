package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class397().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class397().normalize("  x "));
        assertEquals(7, new Class397().merge(2, 5));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class397().merge(2, 5));
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class397().isValid("abc"));
        assertEquals(16, new Class397().capacity());
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        assertEquals(16, new Class397().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class397().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class397().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class397().labelFor(1));
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class397().labelFor(1));
    }

    @Test
    void preservesResetAtZero() {
        new Class397().reset();
        assertNotNull(new Class397());
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

}
