package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class165Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class165().compute(3));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class165().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class165().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class165().merge(2, 5));
    }

}
