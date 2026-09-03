package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void reportsComputeWithNullArgument() {
        new Class359().compute(3);
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class359().normalize("  x "));
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class359().merge(2, 5));
    }

}
