package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class062Test {
    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class062().compute(3));
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class062().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class062().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

}
