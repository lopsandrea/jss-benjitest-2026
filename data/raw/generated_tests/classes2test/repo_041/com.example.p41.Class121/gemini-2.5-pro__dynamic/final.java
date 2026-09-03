package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class121Test {
    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class121().compute(3));
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class121().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class121().merge(2, 5));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class121().compute(3));
    }

}
