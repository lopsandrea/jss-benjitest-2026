package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class115Test {
    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class115().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class115().merge(2, 5));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

}
