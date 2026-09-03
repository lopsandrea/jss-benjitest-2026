package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class035().compute(3));
            assertEquals("ok", new Class035().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class035().normalize("  x "));
            assertEquals(7, new Class035().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class035().merge(2, 5));
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class035().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class035().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class035().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class035().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class035().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class035().capacity());
    }

}
