package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class179Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class179().compute(3);
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class179().normalize("  x "));
        assertEquals(7, new Class179().merge(2, 5));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class179().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class179().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class179().merge(2, 5));
    }

}
