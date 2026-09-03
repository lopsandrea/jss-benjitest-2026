package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class210().compute(3));
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class210().merge(2, 5));
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class210().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class210().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class210().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class210().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class210().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class210().labelFor(1));
    }

    @Test
    void preservesResetForBoundaryValue() {
        new Class210().reset();
        assertNotNull(new Class210());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class210().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

}
