package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class246Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class246().compute(3));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class246().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class246().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class246().merge(2, 5));
    }

}
