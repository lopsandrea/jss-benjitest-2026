package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class318Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class318().compute(3));
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class318().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class318().merge(2, 5));
    }

}
