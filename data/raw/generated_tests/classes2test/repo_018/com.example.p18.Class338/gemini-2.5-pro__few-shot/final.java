package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void keepsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class338().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class338().normalize("  x "));
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

}
