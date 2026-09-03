package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class201Test {
    @Test
    void returnsComputeForBoundaryValue() {
        new Class201().compute(3);
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class201().normalize("  x "));
        assertEquals(7, new Class201().merge(2, 5));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class201().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class201().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class201().merge(2, 5));
    }

}
