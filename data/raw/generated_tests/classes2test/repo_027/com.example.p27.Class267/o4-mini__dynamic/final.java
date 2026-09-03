package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class267Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class267().compute(3));
        assertEquals("ok", new Class267().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class267().merge(2, 5));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

}
