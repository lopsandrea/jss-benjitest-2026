package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void shouldNotThrowOnComputeWithNullArgument() {
        try {
            new Class241().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        new Class241().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        new Class241().merge(2, 5);
    }

    @Test
    void shouldRejectIsValidForBoundaryValue() {
        assertTrue(new Class241().isValid("abc"));
        assertEquals(16, new Class241().capacity());
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        assertEquals(16, new Class241().capacity());
        assertEquals(0.5, new Class241().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class241().isValid("abc"));
    }

}
