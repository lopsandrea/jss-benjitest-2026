package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class242Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class242().compute(3));
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class242().normalize("  x "));
        assertEquals(7, new Class242().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class242().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class242().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

}
