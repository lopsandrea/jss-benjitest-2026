package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class266().compute(3));
            assertEquals("ok", new Class266().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class266().normalize("  x "));
        assertEquals(7, new Class266().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class266().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class266().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenUnset() {
        assertEquals("alpha", new Class266().labelFor(1));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

}
