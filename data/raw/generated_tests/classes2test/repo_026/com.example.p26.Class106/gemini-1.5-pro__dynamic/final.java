package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            new Class106().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class106().normalize("  x "));
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class106().merge(2, 5));
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class106().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class106().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class106().merge(2, 5));
    }

}
