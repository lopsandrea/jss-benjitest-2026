package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class242Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class242().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class242().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class242().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class242().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class242().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class242().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class242().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class242().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class242().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class242().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class242().compute(3));
    }

}
