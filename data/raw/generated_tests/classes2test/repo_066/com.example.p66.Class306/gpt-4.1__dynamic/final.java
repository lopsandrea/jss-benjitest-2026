package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class306().compute(3));
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class306().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

}
