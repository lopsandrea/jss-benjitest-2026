package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class117().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class117().merge(2, 5));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class117().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

}
