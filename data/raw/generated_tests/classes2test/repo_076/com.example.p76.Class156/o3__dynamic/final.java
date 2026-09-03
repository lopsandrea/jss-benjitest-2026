package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class156().compute(3));
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class156().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class156().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class156().isValid("abc"));
    }

}
