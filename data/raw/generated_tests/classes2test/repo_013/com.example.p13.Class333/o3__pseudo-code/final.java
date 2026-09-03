package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class333().compute(3));
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class333().normalize("  x "));
        assertEquals(7, new Class333().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class333().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

}
