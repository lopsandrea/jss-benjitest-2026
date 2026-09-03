package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class285Test {
    @Test
    void shouldReturnComputeForKnownCode() {
        new Class285().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class285().normalize("  x "));
        assertEquals(7, new Class285().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnTrimmedInput() {
        assertEquals(7, new Class285().merge(2, 5));
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidForKnownCode() {
        assertTrue(new Class285().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class285().capacity());
    }

    @Test
    void shouldFailFastCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class285().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class285().compute(3));
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void shouldHandleComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void shouldKeepMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

}
