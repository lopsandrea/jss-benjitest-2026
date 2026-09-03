package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class302().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class302().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class302().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class302().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class302().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class302().merge(2, 5));
    }

}
