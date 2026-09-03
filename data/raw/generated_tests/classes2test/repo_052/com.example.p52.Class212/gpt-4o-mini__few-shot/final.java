package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class212().compute(3));
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class212().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class212().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class212().isValid("abc"));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class212().compute(3));
    }

}
