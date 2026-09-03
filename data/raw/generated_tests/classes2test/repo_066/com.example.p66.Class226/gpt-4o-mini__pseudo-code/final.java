package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        new Class226().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class226().normalize("  x "));
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class226().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class226().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        assertEquals(16, new Class226().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class226().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class226().compute(3));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class226().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class226().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class226().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class226().isValid("abc"));
    }

}
