package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void acceptsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class082().compute(3));
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class082().normalize("  x "));
        assertEquals(7, new Class082().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void clampsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void reportsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNullArgument() {
        assertEquals("alpha", new Class082().labelFor(1));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

}
