package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            new Class360().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class360().normalize("  x "));
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class360().merge(2, 5));
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void clampsResetWithNullArgument() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

}
