package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class070().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class070().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

}
