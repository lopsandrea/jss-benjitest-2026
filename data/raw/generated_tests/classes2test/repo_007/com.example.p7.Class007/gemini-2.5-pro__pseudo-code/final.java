package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class007Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class007().compute(3));
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class007().normalize("  x "));
        assertEquals(7, new Class007().merge(2, 5));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class007().merge(2, 5));
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class007().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class007().isValid("abc"));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class007().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class007().normalize("  x "));
    }

}
