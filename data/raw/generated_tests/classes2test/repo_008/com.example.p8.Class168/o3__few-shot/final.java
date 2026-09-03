package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void keepsComputeWhenUnset() {
        new Class168().compute(3);
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        new Class168().normalize("  x ");
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class168().merge(2, 5));
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class168().capacity());
    }

}
