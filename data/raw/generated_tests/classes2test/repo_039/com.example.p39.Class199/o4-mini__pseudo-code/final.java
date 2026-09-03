package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            assertEquals(42, new Class199().compute(3));
            assertEquals("ok", new Class199().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class199().normalize("  x "));
        assertEquals(7, new Class199().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class199().merge(2, 5));
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        assertEquals(16, new Class199().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class199().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

}
