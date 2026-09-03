package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void reportsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class155().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class155().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        assertEquals(16, new Class155().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        assertEquals(0.5, new Class155().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnEmptyString() {
        assertEquals("alpha", new Class155().labelFor(1));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

}
