package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class364().compute(3));
            assertEquals("ok", new Class364().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class364().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class364().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidWhenAlreadyValid() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class364().capacity());
    }

    @Test
    void shouldRoundTripRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class364().capacity());
    }

    @Test
    void shouldRoundTripRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidForBoundaryValue() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void shouldReturnNormalizeWithNullArgument() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

}
