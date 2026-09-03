package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class151().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

}
