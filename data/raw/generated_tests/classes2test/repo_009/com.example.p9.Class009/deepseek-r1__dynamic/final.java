package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            new Class009().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class009().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class009().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

}
