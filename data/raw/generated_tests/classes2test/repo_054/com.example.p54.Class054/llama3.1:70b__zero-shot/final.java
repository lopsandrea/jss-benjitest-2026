package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class054().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class054().compute(3));
    }

}
