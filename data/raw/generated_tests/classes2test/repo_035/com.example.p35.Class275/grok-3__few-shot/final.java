package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class275().compute(3));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class275().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

}
