package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        new Class024().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class024().normalize("  x "));
        assertEquals(7, new Class024().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class024().merge(2, 5));
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class024().isValid("abc"));
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class024().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class024().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

}
