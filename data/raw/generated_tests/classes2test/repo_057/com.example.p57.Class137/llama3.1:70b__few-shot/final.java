package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            new Class137().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class137().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class137().capacity());
    }

    @Test
    void reportsRatioWithNegativeInput() {
        assertEquals(0.5, new Class137().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class137().labelFor(1));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

}
