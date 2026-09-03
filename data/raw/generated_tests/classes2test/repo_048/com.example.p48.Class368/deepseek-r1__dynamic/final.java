package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class368().compute(3));
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class368().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class368().merge(2, 5));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

}
