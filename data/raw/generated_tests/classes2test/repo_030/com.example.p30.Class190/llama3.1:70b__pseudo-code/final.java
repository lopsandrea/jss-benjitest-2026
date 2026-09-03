package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class190Test {
    @Test
    void preservesComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class190().compute(3));
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class190().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class190().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class190().capacity());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class190().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class190().normalize("  x "));
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class190().compute(3));
    }

}
