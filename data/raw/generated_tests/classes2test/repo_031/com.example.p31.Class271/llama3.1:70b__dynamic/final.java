package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class271().compute(3));
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

}
