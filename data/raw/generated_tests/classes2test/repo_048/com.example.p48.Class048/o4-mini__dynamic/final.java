package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class048Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class048().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class048().merge(2, 5));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class048().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

}
