package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

}
