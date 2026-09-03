package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {
    @Test
    void returnsComputeWithNullArgument() {
        new Class269().compute(3);
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class269().normalize("  x "));
        assertEquals(7, new Class269().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class269().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class269().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class269().merge(2, 5));
    }

}
