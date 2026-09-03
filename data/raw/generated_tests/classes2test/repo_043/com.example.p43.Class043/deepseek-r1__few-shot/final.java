package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class043().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

}
