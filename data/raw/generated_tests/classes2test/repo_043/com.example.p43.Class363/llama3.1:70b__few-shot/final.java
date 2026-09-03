package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class363().compute(3));
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

}
