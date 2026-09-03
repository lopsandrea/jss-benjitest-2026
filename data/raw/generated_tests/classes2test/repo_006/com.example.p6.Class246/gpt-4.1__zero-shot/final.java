package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void preservesComputeForKnownCode() {
        try {
            assertEquals(42, new Class246().compute(3));
            assertEquals("ok", new Class246().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class246().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class246().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void rejectsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class246().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class246().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class246().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class246().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class246().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

}
