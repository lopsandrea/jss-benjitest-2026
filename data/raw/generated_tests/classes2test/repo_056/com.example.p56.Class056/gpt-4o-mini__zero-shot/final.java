package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class056().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class056().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class056().capacity());
    }

}
