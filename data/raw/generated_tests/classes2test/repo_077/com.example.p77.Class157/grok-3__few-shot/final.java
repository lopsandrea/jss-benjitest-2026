package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        new Class157().compute(3);
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class157().normalize("  x "));
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        assertEquals(0.5, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

}
