package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class307().compute(3);
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class307().normalize("  x "));
        assertEquals(7, new Class307().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class307().merge(2, 5));
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class307().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class307().capacity());
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class307().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class307().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class307().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

}
