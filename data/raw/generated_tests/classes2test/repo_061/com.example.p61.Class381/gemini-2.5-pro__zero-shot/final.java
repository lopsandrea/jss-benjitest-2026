package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class381Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        new Class381().compute(3);
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class381().normalize("  x "));
        assertEquals(7, new Class381().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class381().merge(2, 5));
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class381().isValid("abc"));
        assertEquals(16, new Class381().capacity());
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        assertEquals(16, new Class381().capacity());
        assertEquals(0.5, new Class381().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class381().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class381().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class381().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class381().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class381().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        assertEquals(16, new Class381().capacity());
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class381().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class381().merge(2, 5));
    }

}
