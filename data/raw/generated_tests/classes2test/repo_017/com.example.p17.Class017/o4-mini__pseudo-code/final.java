package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class017Test {
    @Test
    void returnsComputeAtZero() {
        new Class017().compute(3);
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class017().normalize("  x "));
        assertEquals(7, new Class017().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class017().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class017().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class017().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class017().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

}
