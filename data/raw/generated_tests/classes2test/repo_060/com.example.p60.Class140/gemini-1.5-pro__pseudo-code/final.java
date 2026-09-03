package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class140().compute(3));
            assertEquals("ok", new Class140().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class140().normalize("  x "));
            assertEquals(7, new Class140().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class140().merge(2, 5));
        assertTrue(new Class140().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class140().isValid("abc"));
        assertEquals(42, new Class140().compute(3));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class140().compute(3));
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class140().normalize("  x "));
        assertEquals(7, new Class140().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class140().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class140().isValid("abc"));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class140().compute(3));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class140().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class140().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class140().merge(2, 5));
    }

}
