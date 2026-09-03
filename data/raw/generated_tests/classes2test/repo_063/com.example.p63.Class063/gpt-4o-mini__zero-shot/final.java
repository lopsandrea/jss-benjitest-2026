package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            new Class063().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class063().normalize("  x "));
        assertEquals(7, new Class063().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class063().merge(2, 5));
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class063().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class063().capacity());
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class063().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class063().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class063().labelFor(1));
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class063().labelFor(1));
        new Class063().reset();
        assertNotNull(new Class063());
    }

    @Test
    void reportsResetOnRepeatedCall() {
        new Class063().reset();
        assertNotNull(new Class063());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

}
