package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {
    @Test
    void clampsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class340().compute(3));
            assertEquals("ok", new Class340().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class340().normalize("  x "));
            assertEquals(7, new Class340().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class340().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class340().merge(2, 5));
    }

}
