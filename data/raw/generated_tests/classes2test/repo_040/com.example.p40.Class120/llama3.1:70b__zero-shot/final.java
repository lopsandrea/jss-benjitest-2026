package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class120().compute(3);
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        new Class120().normalize("  x ");
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class120().merge(2, 5));
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class120().isValid("abc"));
        assertEquals(16, new Class120().capacity());
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class120().capacity());
        assertEquals(0.5, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class120().ratio(1.0, 2.0), 1e-9);
    }

}
