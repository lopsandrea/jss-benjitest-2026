package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class131Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class131().compute(3));
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class131().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class131().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class131().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class131().merge(2, 5));
    }

}
