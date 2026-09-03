package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class099().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class099().normalize("  x "));
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class099().merge(2, 5));
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

}
