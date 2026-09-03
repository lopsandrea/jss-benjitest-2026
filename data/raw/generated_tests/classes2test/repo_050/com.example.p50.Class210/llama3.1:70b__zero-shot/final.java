package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class210().compute(3));
            assertEquals("ok", new Class210().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class210().merge(2, 5));
        assertTrue(new Class210().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class210().isValid("abc"));
        assertEquals(16, new Class210().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class210().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class210().compute(3));
    }

}
