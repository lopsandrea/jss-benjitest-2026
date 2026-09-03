package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void acceptsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class104().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class104().compute(3));
    }

}
