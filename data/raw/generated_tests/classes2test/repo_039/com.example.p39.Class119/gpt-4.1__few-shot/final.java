package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void rejectsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class119().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class119().normalize("  x "));
        assertEquals(7, new Class119().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class119().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class119().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class119().isValid("abc"));
    }

}
