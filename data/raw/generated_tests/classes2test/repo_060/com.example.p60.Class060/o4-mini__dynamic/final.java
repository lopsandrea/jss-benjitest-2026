package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class060().compute(3));
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class060().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class060().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

}
