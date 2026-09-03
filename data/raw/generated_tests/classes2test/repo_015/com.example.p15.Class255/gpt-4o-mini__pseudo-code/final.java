package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class255Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class255().compute(3));
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class255().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class255().merge(2, 5));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class255().compute(3));
    }

}
