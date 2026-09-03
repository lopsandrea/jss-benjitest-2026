package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class139Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class139().compute(3);
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class139().normalize("  x "));
        assertEquals(7, new Class139().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class139().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class139().normalize("  x "));
    }

}
