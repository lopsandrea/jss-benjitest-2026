package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class130Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class130().compute(3));
        assertEquals("ok", new Class130().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class130().normalize("  x "));
        assertEquals(7, new Class130().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class130().merge(2, 5));
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class130().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class130().capacity());
    }

}
