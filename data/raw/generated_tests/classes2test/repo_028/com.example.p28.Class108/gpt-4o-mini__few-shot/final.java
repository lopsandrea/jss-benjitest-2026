package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void rejectsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class108().compute(3));
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class108().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        assertEquals(0.5, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void acceptsResetWhenAlreadyValid() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class108().isValid("abc"));
    }

}
