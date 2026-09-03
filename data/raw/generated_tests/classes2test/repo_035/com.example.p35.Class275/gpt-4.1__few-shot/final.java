package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class275Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class275().compute(3));
        assertEquals("ok", new Class275().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class275().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class275().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class275().merge(2, 5));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class275().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class275().normalize("  x "));
    }

}
