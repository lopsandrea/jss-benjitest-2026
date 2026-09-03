package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class069().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class069().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        assertEquals(16, new Class069().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class069().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class069().merge(2, 5));
    }

}
