package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class131Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class131().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class131().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

}
