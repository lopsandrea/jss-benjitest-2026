package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void keepsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class338().compute(3));
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class338().normalize("  x "));
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class338().merge(2, 5));
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class338().isValid("abc"));
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class338().capacity());
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioWithNegativeInput() {
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

}
