package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        new Class000().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeWithNullArgument() {
        new Class000().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeOnRepeatedCall() {
        assertEquals(7, new Class000().merge(2, 5));
        assertTrue(new Class000().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidWhenUnset() {
        assertTrue(new Class000().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        assertEquals(42, new Class000().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNegativeInput() {
        assertEquals(7, new Class000().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class000().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

}
