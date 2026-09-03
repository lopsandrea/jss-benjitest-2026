package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class342().compute(3));
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class342().normalize("  x "));
        assertEquals(7, new Class342().merge(2, 5));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class342().merge(2, 5));
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

}
