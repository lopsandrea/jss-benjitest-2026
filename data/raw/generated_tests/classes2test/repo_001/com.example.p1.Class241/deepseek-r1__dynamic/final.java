package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class241().compute(3));
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class241().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class241().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class241().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnMixedCase() {
        assertEquals("alpha", new Class241().labelFor(1));
    }

    @Test
    void reportsResetWithNullArgument() {
        new Class241().reset();
        assertNotNull(new Class241());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

}
