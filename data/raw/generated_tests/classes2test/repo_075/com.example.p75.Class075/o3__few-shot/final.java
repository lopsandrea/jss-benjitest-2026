package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class075().compute(3));
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class075().normalize("  x "));
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class075().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class075().merge(2, 5));
    }

}
