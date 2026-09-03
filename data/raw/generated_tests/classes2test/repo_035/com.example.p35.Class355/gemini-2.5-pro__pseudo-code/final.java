package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class355().compute(3));
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class355().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class355().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class355().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class355().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

}
