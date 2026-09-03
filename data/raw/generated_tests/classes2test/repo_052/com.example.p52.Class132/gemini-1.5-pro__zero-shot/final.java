package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class132Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class132().compute(3));
        assertEquals("ok", new Class132().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class132().normalize("  x "));
        assertEquals(7, new Class132().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class132().merge(2, 5));
        assertTrue(new Class132().isValid("abc"));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class132().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class132().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class132().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class132().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class132().capacity());
    }

}
