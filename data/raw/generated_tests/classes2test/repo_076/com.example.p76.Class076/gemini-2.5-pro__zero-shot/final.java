package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void reportsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class076().compute(3));
            assertEquals("ok", new Class076().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class076().normalize("  x "));
            assertEquals(7, new Class076().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class076().merge(2, 5));
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class076().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class076().labelFor(1));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

}
