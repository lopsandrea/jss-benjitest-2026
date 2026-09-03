package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            new Class201().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class201().normalize("  x "));
        assertEquals(7, new Class201().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class201().merge(2, 5));
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class201().isValid("abc"));
        assertEquals(42, new Class201().compute(3));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class201().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

}
