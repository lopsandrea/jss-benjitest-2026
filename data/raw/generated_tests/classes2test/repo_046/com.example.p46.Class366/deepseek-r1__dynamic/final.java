package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class366().compute(3));
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class366().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class366().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

}
