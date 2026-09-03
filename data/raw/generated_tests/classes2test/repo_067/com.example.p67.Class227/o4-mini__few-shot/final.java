package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            new Class227().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class227().merge(2, 5));
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class227().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class227().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class227().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class227().labelFor(1));
    }

}
