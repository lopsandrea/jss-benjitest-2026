package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class355().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class355().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

}
