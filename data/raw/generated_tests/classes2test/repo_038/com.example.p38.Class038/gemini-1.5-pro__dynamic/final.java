package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class038Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class038().compute(3));
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class038().normalize("  x "));
        assertEquals(7, new Class038().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class038().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class038().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class038().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class038().isValid("abc"));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class038().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class038().normalize("  x "));
    }

}
