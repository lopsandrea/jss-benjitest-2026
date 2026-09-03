package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class373Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class373().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class373().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class373().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class373().isValid("abc"));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class373().compute(3));
    }

}
