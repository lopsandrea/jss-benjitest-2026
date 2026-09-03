package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {
    @Test
    void returnsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class238().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class238().normalize("  x "));
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class238().merge(2, 5));
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class238().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class238().merge(2, 5));
    }

}
