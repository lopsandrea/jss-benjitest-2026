package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class055().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class055().merge(2, 5));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

}
