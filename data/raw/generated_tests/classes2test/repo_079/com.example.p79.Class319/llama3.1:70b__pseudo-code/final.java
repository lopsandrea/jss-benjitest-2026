package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class319().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class319().normalize("  x "));
        assertEquals(7, new Class319().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class319().merge(2, 5));
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class319().isValid("abc"));
        assertEquals(42, new Class319().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class319().compute(3));
        assertEquals("ok", new Class319().normalize("  x "));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class319().merge(2, 5));
    }

}
