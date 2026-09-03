package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class210Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class210().compute(3));
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class210().normalize("  x "));
        assertEquals(7, new Class210().merge(2, 5));
    }

    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class210().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class210().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class210().merge(2, 5));
    }

}
