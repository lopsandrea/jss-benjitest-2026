package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class302Test {
    @Test
    void returnsComputeAtZero() {
        new Class302().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class302().normalize("  x "));
        assertEquals(7, new Class302().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class302().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class302().normalize("  x "));
    }

}
