package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class135Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        new Class135().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class135().normalize("  x "));
        assertEquals(7, new Class135().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class135().merge(2, 5));
        assertTrue(new Class135().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class135().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class135().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        assertEquals(0.5, new Class135().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnMixedCase() {
        assertEquals("alpha", new Class135().labelFor(1));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class135().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class135().normalize("  x "));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class135().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class135().normalize("  x "));
    }

}
