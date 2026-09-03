package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class015().compute(3));
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class015().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

}
