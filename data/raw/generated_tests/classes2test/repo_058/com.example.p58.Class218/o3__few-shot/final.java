package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void reportsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class218().compute(3));
            assertEquals("ok", new Class218().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class218().normalize("  x "));
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class218().merge(2, 5));
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class218().isValid("abc"));
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void preservesCapacityOnMixedCase() {
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class218().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class218().merge(2, 5));
    }

}
