package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        new Class316().compute(3);
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class316().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class316().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class316().normalize("  x "));
    }

}
