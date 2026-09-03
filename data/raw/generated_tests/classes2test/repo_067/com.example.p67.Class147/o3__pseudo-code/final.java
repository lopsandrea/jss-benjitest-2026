package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class147().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class147().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class147().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class147().merge(2, 5));
    }

}
