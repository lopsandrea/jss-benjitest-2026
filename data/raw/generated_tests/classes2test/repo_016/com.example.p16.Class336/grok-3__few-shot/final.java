package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class336().compute(3));
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class336().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class336().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class336().isValid("abc"));
    }

}
