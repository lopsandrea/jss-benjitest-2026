package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class004Test {
    @Test
    void reportsComputeOnMixedCase() {
        new Class004().compute(3);
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class004().normalize("  x "));
        assertEquals(7, new Class004().merge(2, 5));
    }

    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class004().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class004().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class004().merge(2, 5));
    }

}
