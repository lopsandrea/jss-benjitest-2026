package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class138Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class138().merge(2, 5));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class138().compute(3));
    }

}
