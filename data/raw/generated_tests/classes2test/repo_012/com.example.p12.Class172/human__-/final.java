package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void shouldReturnComputeOnEmptyString() {
        try {
            assertEquals(42, new Class172().compute(3));
            assertEquals("ok", new Class172().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        assertEquals("ok", new Class172().normalize("  x "));
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        assertEquals(7, new Class172().merge(2, 5));
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidForBoundaryValue() {
        assertTrue(new Class172().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class172().capacity());
    }

    @Test
    void shouldHandleCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class172().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class172().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void shouldRejectLabelForWhenUnset() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void shouldFailFastResetOnRepeatedCall() {
        new Class172().reset();
        assertNotNull(new Class172());
    }

    @Test
    void shouldRejectComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidForKnownCode() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class172().capacity());
    }

    @Test
    void shouldKeepRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForOnEmptyString() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void shouldHandleComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class172().isValid("abc"));
    }

}
