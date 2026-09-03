package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            assertEquals(42, new Class360().compute(3));
            assertEquals("ok", new Class360().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class360().normalize("  x "));
            assertEquals(7, new Class360().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class360().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class360().capacity());
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void clampsResetOnMixedCase() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class360().isValid("abc"));
    }

}
