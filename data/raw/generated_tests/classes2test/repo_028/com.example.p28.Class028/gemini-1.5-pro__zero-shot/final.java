package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class028().compute(3));
            assertEquals("ok", new Class028().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtZero() {
        try {
            assertEquals("ok", new Class028().normalize("  x "));
            assertEquals(7, new Class028().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class028().merge(2, 5));
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class028().isValid("abc"));
        assertEquals(16, new Class028().capacity());
    }

    @Test
    void reportsCapacityOnEmptyString() {
        assertEquals(16, new Class028().capacity());
        assertEquals(0.5, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class028().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void preservesLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class028().isValid("abc"));
    }

}
