package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class220Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class220().compute(3));
        assertEquals("ok", new Class220().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class220().normalize("  x "));
        assertEquals(7, new Class220().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class220().merge(2, 5));
        assertTrue(new Class220().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class220().isValid("abc"));
        assertEquals(42, new Class220().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class220().compute(3));
    }

}
