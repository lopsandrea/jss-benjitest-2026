package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class057().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class057().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class057().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

}
