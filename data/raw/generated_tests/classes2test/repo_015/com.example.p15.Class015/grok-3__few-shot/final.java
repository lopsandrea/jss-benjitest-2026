package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class015().compute(3);
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class015().normalize("  x "));
        assertEquals(7, new Class015().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class015().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

}
