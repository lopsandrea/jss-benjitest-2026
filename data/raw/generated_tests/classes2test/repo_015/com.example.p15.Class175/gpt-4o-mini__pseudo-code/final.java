package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void yieldsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class175().compute(3));
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class175().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class175().capacity());
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

}
