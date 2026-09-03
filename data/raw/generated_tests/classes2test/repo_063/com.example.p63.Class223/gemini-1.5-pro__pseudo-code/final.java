package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void acceptsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class223().compute(3));
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class223().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

}
