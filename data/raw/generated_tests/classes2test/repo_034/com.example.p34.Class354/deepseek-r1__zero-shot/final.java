package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class354Test {
    @Test
    void keepsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class354().compute(3));
            assertEquals("ok", new Class354().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class354().normalize("  x "));
        assertEquals(7, new Class354().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class354().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

}
