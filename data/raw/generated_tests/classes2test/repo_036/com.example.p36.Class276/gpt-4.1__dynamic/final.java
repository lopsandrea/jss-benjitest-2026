package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void keepsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class276().compute(3);
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class276().normalize("  x "));
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class276().merge(2, 5));
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class276().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class276().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class276().compute(3));
    }

}
