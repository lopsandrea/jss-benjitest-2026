package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class027Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class027().compute(3));
            assertEquals("ok", new Class027().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class027().normalize("  x "));
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class027().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class027().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class027().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class027().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenUnset() {
        assertEquals("alpha", new Class027().labelFor(1));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class027().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class027().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class027().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class027().isValid("abc"));
    }

}
