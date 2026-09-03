package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class068Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class068().compute(3));
        assertEquals("ok", new Class068().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class068().normalize("  x "));
        assertEquals(7, new Class068().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class068().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class068().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class068().normalize("  x "));
    }

}
