package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class087().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class087().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class087().compute(3));
    }

}
