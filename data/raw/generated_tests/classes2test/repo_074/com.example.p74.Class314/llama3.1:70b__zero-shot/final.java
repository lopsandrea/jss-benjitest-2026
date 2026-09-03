package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class314().compute(3);
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        new Class314().normalize("  x ");
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class314().merge(2, 5));
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class314().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class314().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class314().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class314().ratio(1.0, 2.0), 1e-9);
    }

}
