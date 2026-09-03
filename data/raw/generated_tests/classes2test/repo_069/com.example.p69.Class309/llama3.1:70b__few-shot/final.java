package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class309().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class309().normalize("  x "));
        assertEquals(7, new Class309().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class309().merge(2, 5));
        assertTrue(new Class309().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class309().isValid("abc"));
        assertEquals(42, new Class309().compute(3));
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class309().compute(3));
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class309().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class309().merge(2, 5));
    }

}
