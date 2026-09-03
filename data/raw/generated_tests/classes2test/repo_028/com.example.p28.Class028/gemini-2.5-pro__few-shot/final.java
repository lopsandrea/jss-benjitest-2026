package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class028().compute(3));
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class028().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class028().capacity());
    }

    @Test
    void keepsRatioWithNullArgument() {
        assertEquals(0.5, new Class028().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class028().labelFor(1));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

}
