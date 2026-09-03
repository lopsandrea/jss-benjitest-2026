package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class326Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class326().compute(3));
            assertEquals("ok", new Class326().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class326().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class326().normalize("  x "));
    }

}
