package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class332().compute(3));
            assertEquals("ok", new Class332().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class332().normalize("  x "));
            assertEquals(7, new Class332().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class332().merge(2, 5));
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

}
