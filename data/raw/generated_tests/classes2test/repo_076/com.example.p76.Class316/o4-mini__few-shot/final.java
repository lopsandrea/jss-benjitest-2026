package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void clampsComputeWhenUnset() {
        new Class316().compute(3);
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class316().normalize("  x "));
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class316().merge(2, 5));
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class316().compute(3));
    }

}
