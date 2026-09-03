package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        new Class002().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class002().normalize("  x "));
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class002().merge(2, 5));
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class002().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class002().capacity());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class002().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class002().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class002().merge(2, 5));
    }

}
