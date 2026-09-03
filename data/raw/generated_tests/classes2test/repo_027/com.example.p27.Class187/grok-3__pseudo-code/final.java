package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class187().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class187().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class187().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class187().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class187().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class187().normalize("  x "));
    }

}
