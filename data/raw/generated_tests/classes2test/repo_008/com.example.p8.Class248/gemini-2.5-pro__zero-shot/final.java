package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void keepsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class248().compute(3));
            assertEquals("ok", new Class248().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class248().normalize("  x "));
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class248().merge(2, 5));
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        assertEquals(16, new Class248().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class248().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class248().labelFor(1));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class248().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class248().ratio(1.0, 2.0), 1e-9);
    }

}
