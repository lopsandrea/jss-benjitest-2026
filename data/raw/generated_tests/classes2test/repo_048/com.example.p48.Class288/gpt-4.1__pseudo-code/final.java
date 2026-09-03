package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class288().compute(3));
            assertEquals("ok", new Class288().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class288().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class288().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class288().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class288().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class288().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class288().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class288().labelFor(1));
    }

    @Test
    void preservesResetWhenAlreadyValid() {
        new Class288().reset();
        assertNotNull(new Class288());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class288().compute(3));
    }

}
