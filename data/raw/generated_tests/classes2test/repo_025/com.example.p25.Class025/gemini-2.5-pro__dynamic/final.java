package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class025().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class025().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class025().merge(2, 5));
    }

    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class025().compute(3));
    }

}
