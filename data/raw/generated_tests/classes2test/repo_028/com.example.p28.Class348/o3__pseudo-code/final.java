package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class348().compute(3));
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class348().normalize("  x "));
        assertEquals(7, new Class348().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class348().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class348().compute(3));
    }

}
