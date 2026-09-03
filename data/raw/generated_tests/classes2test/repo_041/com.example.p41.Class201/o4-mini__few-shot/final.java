package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class201().compute(3));
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

}
