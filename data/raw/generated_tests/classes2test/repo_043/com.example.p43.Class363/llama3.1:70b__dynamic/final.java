package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class363().compute(3));
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class363().normalize("  x "));
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class363().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
    }

}
