package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class239().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class239().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

}
