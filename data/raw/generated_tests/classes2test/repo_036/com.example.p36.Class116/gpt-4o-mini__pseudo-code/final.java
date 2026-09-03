package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class116Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class116().compute(3));
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class116().normalize("  x "));
        assertEquals(7, new Class116().merge(2, 5));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class116().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

}
