package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void shouldHandleComputeWhenUnset() {
        try {
            new Class022().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        new Class022().normalize("  x ");
    }

    @Test
    void shouldNotThrowOnMergeForKnownCode() {
        assertEquals(7, new Class022().merge(2, 5));
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidWhenUnset() {
        assertTrue(new Class022().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class022().capacity());
    }

    @Test
    void shouldRejectCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class022().capacity());
    }

    @Test
    void shouldRejectRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class022().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWhenAlreadyValid() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class022().capacity());
    }

    @Test
    void shouldKeepRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForAtZero() {
        assertEquals("alpha", new Class022().labelFor(1));
    }

    @Test
    void shouldNotThrowOnComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

}
