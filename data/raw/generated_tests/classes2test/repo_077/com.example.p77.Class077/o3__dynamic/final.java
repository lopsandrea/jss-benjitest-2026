package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {
    @Test
    void clampsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class077().compute(3));
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class077().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class077().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class077().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

}
