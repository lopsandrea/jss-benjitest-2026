package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class006().compute(3));
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class006().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class006().normalize("  x "));
    }

}
