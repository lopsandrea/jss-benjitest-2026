package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void keepsComputeAtUpperBound() {
        new Class333().compute(3);
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class333().normalize("  x "));
        assertEquals(7, new Class333().merge(2, 5));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class333().merge(2, 5));
    }

}
