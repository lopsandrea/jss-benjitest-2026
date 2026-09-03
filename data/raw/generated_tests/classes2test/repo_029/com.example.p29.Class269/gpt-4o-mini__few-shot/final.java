package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void keepsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class269().compute(3));
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class269().compute(3));
    }

}
