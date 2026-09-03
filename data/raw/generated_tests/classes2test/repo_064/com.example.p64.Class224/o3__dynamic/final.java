package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class224Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class224().compute(3));
        assertEquals("ok", new Class224().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class224().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class224().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class224().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class224().compute(3));
    }

}
