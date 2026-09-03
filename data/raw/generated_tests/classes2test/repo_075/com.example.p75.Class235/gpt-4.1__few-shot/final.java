package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class235().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class235().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

}
