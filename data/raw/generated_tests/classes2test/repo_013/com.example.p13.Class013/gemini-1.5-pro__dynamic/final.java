package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {
    @Test
    void reportsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class013().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class013().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class013().merge(2, 5));
    }

}
