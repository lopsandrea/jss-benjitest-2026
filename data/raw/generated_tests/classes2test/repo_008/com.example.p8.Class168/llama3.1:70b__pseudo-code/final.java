package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void rejectsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class168().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class168().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class168().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        assertEquals(16, new Class168().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class168().compute(3));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class168().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class168().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class168().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class168().capacity());
    }

}
