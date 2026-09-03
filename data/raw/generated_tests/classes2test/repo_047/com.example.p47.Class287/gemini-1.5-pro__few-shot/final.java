package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class287().compute(3));
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class287().normalize("  x "));
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class287().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

}
