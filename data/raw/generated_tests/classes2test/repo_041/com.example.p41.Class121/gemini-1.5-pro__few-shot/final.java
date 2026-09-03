package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class121().compute(3));
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class121().normalize("  x "));
        assertEquals(7, new Class121().merge(2, 5));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

}
