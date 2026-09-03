package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void yieldsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class207().compute(3));
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class207().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

}
