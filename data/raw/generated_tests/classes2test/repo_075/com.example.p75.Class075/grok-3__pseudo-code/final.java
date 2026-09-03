package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {
    @Test
    void clampsComputeWithNullArgument() {
        new Class075().compute(3);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class075().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class075().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class075().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class075().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        assertEquals(16, new Class075().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class075().ratio(1.0, 2.0), 1e-9);
    }

}
