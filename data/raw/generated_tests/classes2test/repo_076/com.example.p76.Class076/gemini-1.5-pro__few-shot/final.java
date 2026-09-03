package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class076Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class076().compute(3));
            assertEquals("ok", new Class076().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class076().normalize("  x "));
        assertEquals(7, new Class076().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class076().merge(2, 5));
        assertTrue(new Class076().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class076().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class076().capacity());
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class076().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class076().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class076().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class076().labelFor(1));
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class076().labelFor(1));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class076().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class076().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class076().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class076().isValid("abc"));
    }

}
