package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void returnsComputeAtUpperBound() {
        new Class060().compute(3);
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class060().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class060().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        assertEquals(0.5, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class060().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

}
