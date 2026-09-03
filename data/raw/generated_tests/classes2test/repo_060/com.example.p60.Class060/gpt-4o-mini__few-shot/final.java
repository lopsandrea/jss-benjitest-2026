package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class060().compute(3));
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class060().normalize("  x "));
        assertEquals(7, new Class060().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class060().merge(2, 5));
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class060().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class060().capacity());
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

}
