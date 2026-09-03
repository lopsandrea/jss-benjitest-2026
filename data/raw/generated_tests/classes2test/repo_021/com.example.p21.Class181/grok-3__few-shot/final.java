package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class181Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class181().compute(3));
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class181().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class181().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class181().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class181().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class181().capacity());
    }

}
