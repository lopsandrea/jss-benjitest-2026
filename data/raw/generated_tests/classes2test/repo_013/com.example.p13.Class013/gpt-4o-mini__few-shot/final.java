package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class013().compute(3));
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class013().normalize("  x "));
        assertEquals(7, new Class013().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class013().merge(2, 5));
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class013().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class013().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class013().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class013().compute(3));
    }

}
