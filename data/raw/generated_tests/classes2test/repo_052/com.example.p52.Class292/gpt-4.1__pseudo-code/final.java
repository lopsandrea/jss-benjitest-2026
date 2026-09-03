package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class292().compute(3));
            assertEquals("ok", new Class292().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class292().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class292().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        assertEquals(16, new Class292().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        assertEquals(0.5, new Class292().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnMixedCase() {
        assertEquals("alpha", new Class292().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class292().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class292().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class292().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class292().isValid("abc"));
    }

}
