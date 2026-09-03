package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class279Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class279().compute(3));
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class279().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class279().capacity());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class279().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class279().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class279().merge(2, 5));
    }

}
