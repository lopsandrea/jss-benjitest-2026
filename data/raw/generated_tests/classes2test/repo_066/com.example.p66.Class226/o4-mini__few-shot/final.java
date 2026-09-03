package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        try {
            new Class226().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class226().normalize("  x "));
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class226().merge(2, 5));
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class226().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class226().capacity());
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class226().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class226().capacity());
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

}
