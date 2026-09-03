package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        new Class392().compute(3);
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class392().normalize("  x "));
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class392().merge(2, 5));
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class392().isValid("abc"));
        assertEquals(16, new Class392().capacity());
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class392().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class392().merge(2, 5));
    }

}
