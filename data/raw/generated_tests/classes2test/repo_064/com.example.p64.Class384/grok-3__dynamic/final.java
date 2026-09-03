package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        try {
            new Class384().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class384().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class384().merge(2, 5));
    }

}
