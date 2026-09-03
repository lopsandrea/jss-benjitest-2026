package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        new Class120().compute(3);
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class120().normalize("  x "));
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class120().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class120().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class120().isValid("abc"));
    }

}
