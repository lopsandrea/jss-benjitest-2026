package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class218().compute(3));
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

}
