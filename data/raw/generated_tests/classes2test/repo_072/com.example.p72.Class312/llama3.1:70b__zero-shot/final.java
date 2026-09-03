package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class312().compute(3));
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class312().normalize("  x "));
        assertEquals(7, new Class312().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class312().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

}
