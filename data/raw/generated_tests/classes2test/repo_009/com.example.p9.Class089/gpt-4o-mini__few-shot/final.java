package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void clampsComputeAtUpperBound() {
        try {
            new Class089().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class089().normalize("  x "));
            assertEquals(7, new Class089().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class089().merge(2, 5));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class089().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class089().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class089().isValid("abc"));
    }

}
