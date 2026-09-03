package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class263().compute(3));
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class263().normalize("  x "));
        assertEquals(7, new Class263().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class263().merge(2, 5));
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class263().isValid("abc"));
        assertEquals(16, new Class263().capacity());
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        assertEquals(16, new Class263().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        assertEquals(0.5, new Class263().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class263().compute(3));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

}
