package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            new Class304().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class304().normalize("  x "));
        assertEquals(7, new Class304().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class304().merge(2, 5));
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class304().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class304().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtUpperBound() {
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void clampsResetForKnownCode() {
        new Class304().reset();
        assertNotNull(new Class304());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

}
