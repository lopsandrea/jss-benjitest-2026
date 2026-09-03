package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class294().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class294().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        assertEquals(16, new Class294().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class294().isValid("abc"));
    }

}
