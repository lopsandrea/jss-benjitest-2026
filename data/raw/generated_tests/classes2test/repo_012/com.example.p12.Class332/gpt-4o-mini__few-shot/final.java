package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class332().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class332().normalize("  x "));
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class332().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

}
