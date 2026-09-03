package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class149().compute(3));
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class149().compute(3));
    }

}
