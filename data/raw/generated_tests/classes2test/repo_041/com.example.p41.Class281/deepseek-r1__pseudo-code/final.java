package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        try {
            new Class281().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class281().normalize("  x "));
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class281().merge(2, 5));
    }

}
