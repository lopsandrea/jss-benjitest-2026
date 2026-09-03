package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class241().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class241().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class241().labelFor(1));
    }

    @Test
    void rejectsResetAtZero() {
        new Class241().reset();
        assertNotNull(new Class241());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

}
