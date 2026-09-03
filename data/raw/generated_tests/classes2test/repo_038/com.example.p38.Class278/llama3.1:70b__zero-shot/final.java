package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        new Class278().compute(3);
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        new Class278().normalize("  x ");
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class278().merge(2, 5));
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class278().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class278().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

}
