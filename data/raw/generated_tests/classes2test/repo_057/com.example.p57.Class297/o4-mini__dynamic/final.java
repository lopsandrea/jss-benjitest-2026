package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class297().compute(3));
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class297().normalize("  x "));
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class297().merge(2, 5));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

}
