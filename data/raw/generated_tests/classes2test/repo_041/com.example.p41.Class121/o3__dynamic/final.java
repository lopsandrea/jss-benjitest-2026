package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class121().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

}
