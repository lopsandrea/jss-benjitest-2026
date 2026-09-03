package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class185Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class185().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class185().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class185().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class185().normalize("  x "));
    }

}
