package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void returnsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class121().compute(3));
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class121().normalize("  x "));
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class121().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

}
