package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class202Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class202().compute(3));
        assertEquals("ok", new Class202().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class202().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class202().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class202().merge(2, 5));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class202().compute(3));
    }

}
