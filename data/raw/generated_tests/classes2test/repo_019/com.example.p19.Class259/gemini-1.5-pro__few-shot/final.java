package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class259().compute(3));
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class259().normalize("  x "));
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class259().capacity());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

}
