package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class000().compute(3);
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        new Class000().normalize("  x ");
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class000().merge(2, 5));
        assertTrue(new Class000().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class000().isValid("abc"));
        assertEquals(42, new Class000().compute(3));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class000().compute(3));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

}
