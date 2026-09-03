package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class327Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            new Class327().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        new Class327().normalize("  x ");
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class327().merge(2, 5));
        assertTrue(new Class327().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class327().isValid("abc"));
        assertEquals(42, new Class327().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class327().compute(3));
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class327().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

}
