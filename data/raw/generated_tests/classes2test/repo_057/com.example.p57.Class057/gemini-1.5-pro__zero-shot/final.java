package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class057().compute(3));
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class057().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class057().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

}
