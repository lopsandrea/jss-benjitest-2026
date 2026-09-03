package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class231Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class231().compute(3));
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class231().normalize("  x "));
        assertEquals(7, new Class231().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class231().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class231().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class231().merge(2, 5));
    }

}
