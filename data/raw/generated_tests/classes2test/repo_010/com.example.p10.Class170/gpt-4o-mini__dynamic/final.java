package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            assertEquals(42, new Class170().compute(3));
            assertEquals("ok", new Class170().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class170().normalize("  x "));
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class170().merge(2, 5));
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class170().isValid("abc"));
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class170().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

}
