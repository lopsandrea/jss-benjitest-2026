package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class327Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class327().compute(3));
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class327().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class327().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class327().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class327().merge(2, 5));
    }

}
