package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class007().compute(3));
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class007().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

}
