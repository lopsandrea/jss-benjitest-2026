package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class072().compute(3));
        assertEquals("ok", new Class072().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class072().normalize("  x "));
        assertEquals(7, new Class072().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class072().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class072().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class072().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class072().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class072().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class072().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class072().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class072().compute(3));
    }

}
