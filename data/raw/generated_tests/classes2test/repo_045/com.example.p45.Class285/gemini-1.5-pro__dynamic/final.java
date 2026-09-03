package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class285Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class285().compute(3));
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class285().normalize("  x "));
        assertEquals(7, new Class285().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class285().merge(2, 5));
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class285().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class285().capacity());
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

}
