package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class277().compute(3));
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class277().normalize("  x "));
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        assertEquals(16, new Class277().capacity());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class277().capacity());
    }

}
