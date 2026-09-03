package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class204().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class204().merge(2, 5));
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class204().compute(3));
    }

}
