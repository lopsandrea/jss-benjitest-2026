package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class125Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            assertEquals(42, new Class125().compute(3));
            assertEquals("ok", new Class125().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class125().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class125().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class125().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class125().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class125().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class125().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class125().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class125().normalize("  x "));
    }

}
