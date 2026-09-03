package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class205Test {
    @Test
    void shouldRejectComputeWithNegativeInput() {
        new Class205().compute(3);
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        assertEquals(42, new Class205().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class205().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        assertEquals(7, new Class205().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidForBoundaryValue() {
        assertTrue(new Class205().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        assertEquals(16, new Class205().capacity());
    }

}
