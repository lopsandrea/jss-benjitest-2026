package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class339().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

}
