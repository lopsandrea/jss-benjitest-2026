package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class003Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class003().compute(3));
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class003().normalize("  x "));
        assertEquals(7, new Class003().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class003().merge(2, 5));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class003().compute(3));
    }

}
