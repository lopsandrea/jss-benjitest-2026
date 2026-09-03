package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class297().compute(3));
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class297().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class297().merge(2, 5));
    }

}
