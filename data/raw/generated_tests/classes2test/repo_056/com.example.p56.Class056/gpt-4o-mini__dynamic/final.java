package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class056().compute(3));
            assertEquals("ok", new Class056().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class056().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class056().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class056().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class056().ratio(1.0, 2.0), 1e-9);
    }

}
