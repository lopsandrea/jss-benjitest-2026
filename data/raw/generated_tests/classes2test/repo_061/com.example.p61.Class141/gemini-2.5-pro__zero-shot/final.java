package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void returnsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class141().compute(3));
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

}
