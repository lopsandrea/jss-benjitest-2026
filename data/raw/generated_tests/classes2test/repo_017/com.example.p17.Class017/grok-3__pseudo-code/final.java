package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class017Test {
    @Test
    void acceptsComputeAtZero() {
        new Class017().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        new Class017().normalize("  x ");
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class017().merge(2, 5));
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class017().isValid("abc"));
        assertEquals(42, new Class017().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class017().isValid("abc"));
    }

}
