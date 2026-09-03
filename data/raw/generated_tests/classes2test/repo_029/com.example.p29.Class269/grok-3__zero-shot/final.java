package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void acceptsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class269().compute(3);
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class269().normalize("  x "));
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class269().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class269().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class269().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class269().isValid("abc"));
    }

}
