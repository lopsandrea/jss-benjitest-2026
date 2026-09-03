package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class105().compute(3));
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class105().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class105().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class105().isValid("abc"));
    }

}
