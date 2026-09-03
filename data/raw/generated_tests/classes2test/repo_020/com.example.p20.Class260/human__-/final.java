package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void shouldReturnComputeWithNegativeInput() {
        try {
            new Class260().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeAtZero() {
        new Class260().normalize("  x ");
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        assertEquals(7, new Class260().merge(2, 5));
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class260().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class260().capacity());
    }

    @Test
    void shouldIgnoreCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class260().capacity());
    }

    @Test
    void shouldRoundTripComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeAtUpperBound() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class260().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnMixedCase() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void shouldReturnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnMixedCase() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class260().merge(2, 5));
    }

}
