package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class009().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class009().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class009().isValid("abc"));
    }

}
