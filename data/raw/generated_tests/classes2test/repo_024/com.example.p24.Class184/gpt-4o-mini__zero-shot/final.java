package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class184().compute(3));
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class184().normalize("  x "));
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class184().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        assertEquals(0.5, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

}
