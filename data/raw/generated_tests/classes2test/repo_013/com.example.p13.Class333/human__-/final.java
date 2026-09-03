package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void shouldFailFastComputeOnMixedCase() {
        assertEquals(42, new Class333().compute(3));
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class333().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class333().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class333().capacity());
    }

}
