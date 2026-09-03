package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {
    @Test
    void returnsComputeWhenUnset() {
        new Class113().compute(3);
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class113().normalize("  x "));
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class113().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

}
