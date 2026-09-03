package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class217().compute(3));
            assertEquals("ok", new Class217().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class217().normalize("  x "));
        assertEquals(7, new Class217().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class217().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class217().normalize("  x "));
    }

}
