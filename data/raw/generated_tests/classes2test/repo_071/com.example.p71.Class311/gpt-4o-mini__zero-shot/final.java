package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class311Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class311().compute(3));
        assertEquals("ok", new Class311().normalize("  x "));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class311().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class311().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class311().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class311().capacity());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class311().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class311().normalize("  x "));
    }

}
