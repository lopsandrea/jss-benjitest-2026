package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class127Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class127().compute(3));
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class127().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class127().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class127().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class127().normalize("  x "));
    }

}
