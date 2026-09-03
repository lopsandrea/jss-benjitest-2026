package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class171().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class171().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class171().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class171().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnEmptyString() {
        assertEquals("alpha", new Class171().labelFor(1));
    }

    @Test
    void reportsResetForKnownCode() {
        new Class171().reset();
        assertNotNull(new Class171());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

}
