package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {
    @Test
    void acceptsComputeAtZero() {
        new Class097().compute(3);
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class097().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class097().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class097().merge(2, 5));
    }

}
