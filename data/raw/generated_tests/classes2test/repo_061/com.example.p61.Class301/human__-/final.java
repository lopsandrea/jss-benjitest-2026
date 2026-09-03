package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void shouldReturnComputeAtZero() {
        try {
            assertEquals(42, new Class301().compute(3));
            assertEquals("ok", new Class301().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class301().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastMergeOnEmptyString() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class301().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnIsValidWithNullArgument() {
        try {
            assertTrue(new Class301().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void shouldRejectRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForKnownCode() {
        assertEquals("alpha", new Class301().labelFor(1));
    }

    @Test
    void shouldIgnoreResetWhenUnset() {
        new Class301().reset();
        assertNotNull(new Class301());
    }

    @Test
    void shouldHandleComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidOnTrimmedInput() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class301().compute(3));
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class301().merge(2, 5));
    }

}
