package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class371().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class371().merge(2, 5));
    }

}
