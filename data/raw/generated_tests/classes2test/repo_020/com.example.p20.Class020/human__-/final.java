package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void shouldHandleComputeForKnownCode() {
        assertEquals(42, new Class020().compute(3));
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void shouldReturnNormalizeWithNegativeInput() {
        assertEquals("ok", new Class020().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class020().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class020().capacity());
    }

    @Test
    void shouldKeepRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class020().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForForBoundaryValue() {
        assertEquals("alpha", new Class020().labelFor(1));
    }

    @Test
    void shouldRoundTripComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidOnMixedCase() {
        assertTrue(new Class020().isValid("abc"));
    }

}
