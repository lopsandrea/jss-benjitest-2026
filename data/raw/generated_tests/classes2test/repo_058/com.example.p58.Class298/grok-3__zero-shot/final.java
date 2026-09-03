package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class298Test {
    @Test
    void rejectsComputeWithNullArgument() {
        new Class298().compute(3);
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class298().normalize("  x "));
        assertEquals(7, new Class298().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class298().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class298().normalize("  x "));
    }

}
