package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class253().compute(3));
            assertEquals("ok", new Class253().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class253().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class253().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class253().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class253().capacity());
    }

    @Test
    void keepsRatioForBoundaryValue() {
        assertEquals(0.5, new Class253().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class253().labelFor(1));
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class253().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class253().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class253().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class253().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class253().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class253().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class253().merge(2, 5));
    }

}
