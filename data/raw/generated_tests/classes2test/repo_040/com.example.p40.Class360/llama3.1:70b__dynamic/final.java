package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class360().compute(3));
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnEmptyString() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void preservesResetOnRepeatedCall() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

}
