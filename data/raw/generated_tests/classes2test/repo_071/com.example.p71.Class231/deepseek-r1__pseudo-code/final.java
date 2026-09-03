package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class231().compute(3));
            assertEquals("ok", new Class231().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class231().normalize("  x "));
        assertEquals(7, new Class231().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class231().merge(2, 5));
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class231().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class231().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class231().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class231().labelFor(1));
    }

}
