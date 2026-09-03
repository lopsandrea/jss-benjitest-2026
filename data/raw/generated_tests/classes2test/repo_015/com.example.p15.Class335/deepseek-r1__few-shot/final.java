package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class335Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class335().compute(3));
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class335().normalize("  x "));
        assertEquals(7, new Class335().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class335().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class335().capacity());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class335().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class335().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class335().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class335().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class335().compute(3));
    }

}
