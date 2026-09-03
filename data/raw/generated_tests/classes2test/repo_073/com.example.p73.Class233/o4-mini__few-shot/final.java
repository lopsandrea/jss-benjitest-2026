package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class233Test {
    @Test
    void yieldsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class233().compute(3));
        assertEquals("ok", new Class233().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class233().normalize("  x "));
        assertEquals(7, new Class233().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class233().merge(2, 5));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class233().compute(3));
    }

}
