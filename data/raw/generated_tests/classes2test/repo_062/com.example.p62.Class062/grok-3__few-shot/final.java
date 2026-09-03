package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class062Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class062().compute(3);
    }

    @Test
    void returnsNormalizeAtZero() {
        new Class062().normalize("  x ");
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class062().merge(2, 5));
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

}
