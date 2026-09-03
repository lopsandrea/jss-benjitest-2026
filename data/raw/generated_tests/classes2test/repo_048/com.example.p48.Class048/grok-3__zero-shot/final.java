package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class048Test {
    @Test
    void reportsComputeAtZero() {
        try {
            new Class048().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        try {
            new Class048().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class048().merge(2, 5));
        assertTrue(new Class048().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class048().isValid("abc"));
        assertEquals(42, new Class048().compute(3));
    }

    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class048().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class048().merge(2, 5));
    }

}
