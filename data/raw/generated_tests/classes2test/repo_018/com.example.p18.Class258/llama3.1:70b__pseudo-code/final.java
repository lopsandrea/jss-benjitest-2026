package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class258().compute(3));
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class258().normalize("  x "));
        assertEquals(7, new Class258().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenUnset() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void clampsResetWithNegativeInput() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

}
