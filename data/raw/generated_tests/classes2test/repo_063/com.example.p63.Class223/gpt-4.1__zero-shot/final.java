package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void keepsComputeWhenUnset() {
        new Class223().compute(3);
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class223().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class223().capacity());
    }

}
