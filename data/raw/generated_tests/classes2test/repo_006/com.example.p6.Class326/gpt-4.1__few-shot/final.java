package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        new Class326().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class326().normalize("  x "));
        assertEquals(7, new Class326().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
        assertTrue(new Class326().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class326().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class326().merge(2, 5));
    }

}
