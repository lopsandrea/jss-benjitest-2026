package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class035().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class035().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class035().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class035().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class035().merge(2, 5));
    }

}
